package com.ecommerce.user.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	private Long mobile;
	private String email;
	private String password;
	private String country;
	private String address;
	private String city;
	private String state;
	private Integer postalCode;
}
