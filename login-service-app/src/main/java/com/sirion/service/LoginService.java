package com.sirion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sirion.entity.User;
import com.sirion.repo.LoginRepo;

import jakarta.validation.Valid;

public class LoginService {
	@Autowired
	LoginRepo repo;
	
	public User addUser(@Valid User u) {
		return repo.saveAndFlush(u);
	}
	
	public User removeUser(User u) {
		Optional<User> op = repo.findById(u.getUserId());
		if(op.isPresent()) {
			repo.delete(u);
			return u;
		}
		return null;
	}
	
	public User ValidateUser(User u) {
		Optional<User> op = repo.findById(u.getUserId());
		if(op.isPresent()) {
			if(u.getPassword() == op.get().getPassword())
				return u;
		}
		return null;
	}
	public List<User> viewAll() {
		return repo.findAll();
	}
}
