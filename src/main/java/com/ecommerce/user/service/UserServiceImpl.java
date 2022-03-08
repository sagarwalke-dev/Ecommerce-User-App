package com.ecommerce.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.user.dao.UserDAO;
import com.ecommerce.user.entity.LoginRequest;
import com.ecommerce.user.entity.LoginResponse;
import com.ecommerce.user.modal.User;
import com.ecommerce.user.util.Base64;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com UserServiceImpl.java 27-Feb-2022
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;

	/**
	 *
	 */
	@Override
	public String createAccount(User user) {
		String result;
		Integer daoResult = 0;
		try {
			// encrypt password
			user.setPassword(Base64.encrypt(user.getPassword()));
			daoResult = dao.saveUser(user);
			if (daoResult == 1) {
				result = "account created successfully";
			} else {
				result = "failed to create account";
			}
		} catch (Exception e) {
			result ="internal server error \n Error: " + e.getMessage();
		}
		return result;
	}

	/**
	 *
	 */
	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		LoginResponse loginResponse;
		LoginResponse response;
		try {
			// Get password from DB
			String password = dao.getPasswordByUserName(loginRequest.getUsername());
			if (password != null) {
				// Decrypt password
				password = Base64.decrypt(password);
				if (password.equals(loginRequest.getPassword())) {
					// User Login success
					loginResponse = new LoginResponse(200, loginRequest.getUsername(), "Login Success", "jwt token",
							"login time");
				} else {
					// Incorrect password
					loginResponse = new LoginResponse(403, loginRequest.getUsername(),
							"Incorrect username and password", "", "login time");
				}
			} else {
				// User not found
				loginResponse = new LoginResponse(404, loginRequest.getUsername(), "User not found", "", "login time");
			}

		} catch (Exception e) {
			loginResponse = new LoginResponse(500, loginRequest.getUsername(), "Internal server error Success", "",
					"login time");
		}
		return loginResponse;

	}
}
