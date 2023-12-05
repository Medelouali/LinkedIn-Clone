package com.ensa.identityprovider.services;

import com.ensa.identityprovider.dtos.AuthResponse;
import com.ensa.identityprovider.models.UserCredentials;
import com.ensa.identityprovider.repos.UserCredentialsRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final UserCredentialsRepo userCredentialsRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthResponse saveUser(UserCredentials credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        try{
            userCredentialsRepo.save(credential);
            return new AuthResponse(
                    jwtService.generateToken(credential.getEmail()),
                    "Account created successfully",
                    false
            );
        }catch (Exception e){
            return new AuthResponse("", "Please check your credentials", true);
        }
    }

    public AuthResponse generateToken(String email) {
        return new AuthResponse(
                jwtService.generateToken(email),
                "created token successfully",
                false
        );
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
}
