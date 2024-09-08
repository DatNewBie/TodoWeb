package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.model.UserEntity;
import com.springmvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity findByUsername(String username) {
		return userRepository.findOneByUsername(username);
	}
	
	public void addUser(UserEntity user) {
		userRepository.save(user);
	}
}
