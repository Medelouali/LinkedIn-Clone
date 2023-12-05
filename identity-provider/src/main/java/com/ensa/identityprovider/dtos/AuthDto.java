package com.ensa.identityprovider.dtos;

import lombok.Data;

@Data
public class AuthDto {
    private String email;
    private String password;
}
