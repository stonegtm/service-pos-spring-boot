package com.Pos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {
    @PostMapping("/register")
    public Boolean registerUser() {
        boolean isCorect = true;
        System.out.print(isCorect);
        return isCorect;
    }
}
