package com.ensa.identityprovider.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse{
    private String token;
    private String errorMessage;
    private boolean errorStatus;
}
