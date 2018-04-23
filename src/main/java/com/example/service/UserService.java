package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository rep;
	
	public User createUser(User user) {
		User createduser=rep.save(user);
		return createduser;
	}
	
	
	public List<User> getAllUsers() {
		
     return rep.findAll();
	
	}
	
	public Optional<User> getUserById(Integer id) {
		return rep.findById(id);
		
	}

	
	
	
}
