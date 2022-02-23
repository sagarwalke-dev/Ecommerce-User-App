package com.ecommerce.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.user.entity.ForgetPasswordRequest;
import com.ecommerce.user.entity.LoginRequest;
import com.ecommerce.user.modal.User;
import com.ecommerce.user.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired 
	UserService service;
	
	@PostMapping("/create-account")
	public ResponseEntity<String> createAccount(@RequestBody User user) {
		return service.createAccount(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest loginRequest) {
		return null;
	}
	
	@PostMapping("/forget-password")
	public String forgetPassword(@RequestBody ForgetPasswordRequest forgetPasswordRequest) {
		return null;
	}
}
