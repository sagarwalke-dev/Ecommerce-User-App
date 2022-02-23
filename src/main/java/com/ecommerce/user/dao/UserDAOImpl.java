package com.ecommerce.user.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.user.modal.User;
@Repository
public class UserDAOImpl implements UserDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);

	private static final String INSERT_USER = "insert  into user(firstName,lastName,mobile,email,password,address,country,state,city,postalCode) values \r\n"
			+ "(?,?,?,?,?,?,?,?,?,?);";

	@Autowired
	private JdbcTemplate template;

	@Override
	public Integer saveUser(User user) {
		Integer result = 0;
		try {
			result = template.update(INSERT_USER, user.getFirstName(), user.getLastName(), user.getMobile(),
					user.getEmail(), user.getPassword(), user.getAddress(), user.getCountry(), user.getState(),
					user.getCity(), user.getPostalCode());
			log.info("user account create");
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return result;
	}

}
