package com.inventory.management.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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
