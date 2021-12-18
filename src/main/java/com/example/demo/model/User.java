package com.example.demo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.demo.annotation.UniqueUserName;



public class User {

	@NotEmpty(message = "Communication preference is required")
	@NotNull(message = "Name cannot be null")
	@UniqueUserName(message ="such username already exist")
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
