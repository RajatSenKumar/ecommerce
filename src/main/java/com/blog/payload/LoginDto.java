package com.blog.payload;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail; // Corrected field name
    private String password;
}
