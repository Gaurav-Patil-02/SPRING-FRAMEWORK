package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.ConfigurationClass;
import com.spring.entity.Users;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Users user = context.getBean(Users.class);
		user.getSim1().calling();
		user.getSim2().calling();;
	}
}
