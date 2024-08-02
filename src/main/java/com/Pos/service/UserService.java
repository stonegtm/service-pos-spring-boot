package com.Pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Pos.dto.UserRegisterDTO;
import com.Pos.model.UserEntity;
import com.Pos.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public void registerUser(UserRegisterDTO userRegisterDTO) {
        // Validate password and confirm password
        if (!userRegisterDTO.getPassword().equals(userRegisterDTO.getConfirmPassword())) {
            throw new IllegalArgumentException("Passwords do not match");
        }

        // Hash the password
        String hashedPassword = passwordEncoder.encode(userRegisterDTO.getPassword());

        UserEntity user = new UserEntity();
        user.setUsername(userRegisterDTO.getUsername());
        user.setPassword(hashedPassword);
        user.setEmail(userRegisterDTO.getEmail());
        userRepository.save(user);
    }
}
