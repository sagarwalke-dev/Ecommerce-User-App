package com.ecommerce.user.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.user.modal.User;


public interface UserDAO {

	public Integer saveUser(User user);
}
