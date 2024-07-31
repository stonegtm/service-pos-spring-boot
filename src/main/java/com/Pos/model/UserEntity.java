package com.Pos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "user_admin")
public class UserEntity {

    @Id
    private Long id;
    private String name;
    private String email;
}
