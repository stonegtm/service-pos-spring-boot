package com.Pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pos.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}