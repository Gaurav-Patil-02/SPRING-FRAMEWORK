package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ComponentScanner;
import com.entity.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanner.class);
		Employee e = context.getBean(Employee.class);
		
		e.setId(10);
		e.setName("Gaurav");
		e.setDesignation("Software Engineer");
		System.out.println(e);
	}
}
