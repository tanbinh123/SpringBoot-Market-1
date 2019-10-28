package com.example.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.market.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findFirstByEmail(String email);
}
