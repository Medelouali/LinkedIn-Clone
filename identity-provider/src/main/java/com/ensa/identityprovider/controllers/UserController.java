package com.ensa.identityprovider.controllers;

import com.ensa.identityprovider.annotations.StepupAuthentication;
import com.ensa.identityprovider.models.User;
import com.ensa.identityprovider.repos.UserRepository;
import com.ensa.identityprovider.resources.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "user",
        produces = {"application/json"})
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public UserView get(@RequestParam String email) {
        return UserView.from(userRepository.getUserByEmail(email));
    }

    @PutMapping
    public ResponseEntity<Void> create(@RequestBody UserView userView) {
        User user = UserView.to(userView);

        userRepository.createUserByEmail(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> update(@RequestParam String email, @RequestBody UserView userView) {
        User user = UserView.to(userView);

        userRepository.updateUserByEmail(email, user);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    @StepupAuthentication
    public ResponseEntity<Void> delete(@RequestParam String email) {
        userRepository.deleteUserByEmail(email);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
