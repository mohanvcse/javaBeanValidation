package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserServiceImpl implements UserService {
	
	@Override
	public void addUser(User user) {
		List<User> userList = new ArrayList<>();
		userList.add(user);
	}

}
