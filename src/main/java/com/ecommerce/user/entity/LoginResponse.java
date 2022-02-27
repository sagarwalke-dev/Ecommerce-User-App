package com.ecommerce.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
	private Integer status;
	private String username;
	private String message;
	private String token;
	private String loginTime;
	
}
