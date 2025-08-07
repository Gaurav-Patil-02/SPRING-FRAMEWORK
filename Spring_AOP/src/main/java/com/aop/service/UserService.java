package com.aop.service;

import org.springframework.stereotype.Service;

import com.aop.entity.User;

@Service
public class UserService {
	public void createUser(User user) {
		System.out.println("Creating User.....");
	}
	
	public String deleteUser(int id) {
		if(id <= 0) {
			throw new IllegalArgumentException("Invalid User id : " + id);
		}
		return "Deleting User with ID : " + id;
	}
}
