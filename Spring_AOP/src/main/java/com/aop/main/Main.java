package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.UserConfig;
import com.aop.entity.User;
import com.aop.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		UserService service = context.getBean(UserService.class);
		User user = context.getBean(User.class);
		user.setName("Gaurav");
		user.setId(1);
		service.createUser(user);
		service.deleteUser(1);
	}
}
