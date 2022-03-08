package com.ecommerce.user.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.ecommerce.user.entity.LoginRequest;
import com.ecommerce.user.entity.LoginResponse;
import com.ecommerce.user.service.UserService;

@ExtendWith(SpringExtension.class)
@RunWith(PowerMockRunner.class)
@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Test
	void testLogin() throws Exception {
		LoginRequest loginRequest = null;
		LoginResponse loginResponse = new LoginResponse();
		Mockito.when(userService.login(loginRequest)).thenReturn(loginResponse);
		mockMvc.perform(MockMvcRequestBuilders.post("/user/login/").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andReturn();
	}

	@Test
	void testLoginException() {
		Assertions.assertThrows(Exception.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				UserController userController = new UserController();
				userController.login(null);
			}
		});
	}

}
