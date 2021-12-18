package com.example.demo.annotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

	private final List<String> uniqueUserName = Arrays.asList("email", "mobilePhone");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return uniqueUserName.contains(value);
	}

}
