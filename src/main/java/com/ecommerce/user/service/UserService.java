package com.ecommerce.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.user.entity.LoginRequest;
import com.ecommerce.user.entity.LoginResponse;
import com.ecommerce.user.modal.User;


public interface UserService {
	
	public ResponseEntity<String> createAccount(User user);
	public ResponseEntity<LoginResponse> login(LoginRequest loginRequest);
	
}
