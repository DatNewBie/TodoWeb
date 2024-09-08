package com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	UserEntity findOneByUsername(String name);
}
