package com.ensa.identityprovider.controllers;

import com.ensa.identityprovider.dtos.AuthDto;
import com.ensa.identityprovider.dtos.AuthResponse;
import com.ensa.identityprovider.models.UserCredentials;
import com.ensa.identityprovider.repos.UserCredentialsRepo;
import com.ensa.identityprovider.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
@RestController
@RequestMapping(value = "/api/v1/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthService service;
    private final UserCredentialsRepo userCredentialsRepo;

    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public AuthResponse addNewUser(@RequestBody UserCredentials user) throws Exception{
        if(userCredentialsRepo.findByEmail(user.getEmail()).isPresent())
            return new AuthResponse(
                "",
                "This email has already been registered, please try another one.",
                true
            );
        return service.saveUser(user);
    }

    @PostMapping("/token")
    public AuthResponse getToken(@RequestBody AuthDto authRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        if (authenticate.isAuthenticated()) {
            return service.generateToken(authRequest.getEmail());
        } else {
            throw new RuntimeException("invalid access");
        }
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) {
        service.validateToken(token);
        return "Token is valid";
    }
}
