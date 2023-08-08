package com.sirion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirion.entity.User;
import com.sirion.service.LoginService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("login")
public class LoginController {
	@Autowired
	LoginService service;
	
	@PostMapping("/addUser")
	public User addUser(@Valid User u) {
		return service.addUser(u);
	}
	@PostMapping("/deleteUser")
	public User removeUser(User u) {
		return service.removeUser(u);
	}
	
	@PostMapping("/validateUser")
	public User ValidateUser(User u) {
		return service.ValidateUser(u);
	}
	@GetMapping("/viewAll")
	public List<User> viewAll() {
		return service.viewAll();
	}
	
}
