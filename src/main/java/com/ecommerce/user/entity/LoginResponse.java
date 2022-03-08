package com.ecommerce.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
	private Integer status;
	private String username;
	private String message;
	private String token;
	private String loginTime;
	
}
