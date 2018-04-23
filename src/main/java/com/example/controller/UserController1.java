package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;

@Controller
@RestController
public class UserController1{

	@Autowired
	UserService userservice;
	
	@RequestMapping(value="crudtasks",method=RequestMethod.POST)
	public String addUser(@RequestBody User user) {
		User userCreated=userservice.createUser(user);
		if(userCreated!=null)
		return "Success";
		else
			return "fail";
		
	}
	@RequestMapping("hello1")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="crudtasks",method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@RequestMapping(value="crudtasks",method=RequestMethod.GET)
	public Optional<User> getById(Integer id){
		return userservice.getUserById(id);
	}
	
	
	
	}

