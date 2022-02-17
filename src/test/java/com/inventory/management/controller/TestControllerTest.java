package com.inventory.management.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest
class TestControllerTest {

	@InjectMocks
	TestController controller;
	
	@Test
	void testTestMethod() {
		String result = controller.testMethod();
		assertEquals("Hi", result);
	}

}
