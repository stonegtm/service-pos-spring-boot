package com.Pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pos.dto.UserRegisterDTO;
import com.Pos.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class Auth {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegisterDTO userRegisterDTO) {
        userService.registerUser(userRegisterDTO);
        // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+userRegisterDTO.getUsername());
        return ResponseEntity.ok("User registered successfully");
    }
}
