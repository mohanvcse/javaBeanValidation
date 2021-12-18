package com.example.demo;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomValidationApplication {
	public static Logger log =LoggerFactory.getLogger(CustomValidationApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("application started...");
	}

	public static void main(String[] args) {
		log.info("application executed...");
		SpringApplication.run(CustomValidationApplication.class, args);
	}

}
