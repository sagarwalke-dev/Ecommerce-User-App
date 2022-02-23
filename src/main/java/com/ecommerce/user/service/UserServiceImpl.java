package com.ecommerce.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.user.dao.UserDAO;
import com.ecommerce.user.modal.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDAO dao;
	
	@Override
	public ResponseEntity<String> createAccount(User user) {
		ResponseEntity<String> result;
		Integer daoResult=0;
		try {
			daoResult=dao.saveUser(user);
			if(daoResult==1) {
				result=new ResponseEntity<String>("account created successfully", HttpStatus.OK);
			}else {
				result=new ResponseEntity<String>("failed to create account", HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			result=new ResponseEntity<String>("internal server error \n Error: "+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}

}
