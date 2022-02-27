package com.ecommerce.user.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.user.modal.User;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com UserDAOImpl.java 27-Feb-2022
 */
@Repository
public class UserDAOImpl implements UserDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);

	private static final String INSERT_USER = "insert  into user(firstName,lastName,mobile,email,password,address,country,state,city,postalCode) values \r\n"
			+ "(?,?,?,?,?,?,?,?,?,?);";
	private static final String GET_PASSWORD_BY_USER="select password from user where email=?"; 

	@Autowired
	private JdbcTemplate template;

	/**
	 *
	 */
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

	@Override
	public String getPasswordByUserName(String username) {
		List<Map<String, Object>> result=null;
		String password=null;
		try {
			log.info("getPasswordByUserName start");
			result=template.queryForList(GET_PASSWORD_BY_USER, username);
			password=(String) result.get(0).get("password");
			log.info("getPasswordByUserName end");
		} catch (Exception e) {
			log.error("getPasswordByUserName error : "+e.getMessage());
		}
		return password;
	}

}
