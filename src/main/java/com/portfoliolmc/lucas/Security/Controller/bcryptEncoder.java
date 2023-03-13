
package com.portfoliolmc.lucas.Security.Controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class bcryptEncoder{
    
    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    public static String encode(String password) {
        return encoder.encode(password);
    }
    
    public static void main(String[] args) {
        String password = "password";
        String hashedPassword = encode(password);
        System.out.println(hashedPassword);
    }
}

