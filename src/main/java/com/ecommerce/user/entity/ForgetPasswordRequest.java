package com.ecommerce.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForgetPasswordRequest {

	private Integer userId;
	private String email;
	private String oldPassword;
	private String newPassword;
}
