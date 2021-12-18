package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CustomValidationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(" test case executed...");
		//Assertions.assertTrue(true,true);
		Assertions.assertEquals("java", "java");
	}
	
	

}
