package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee emp = app.getBean(Employee.class);
		
		emp.setId(10);
		emp.setName("Krishn");
		emp.setDesignation("Engineer");
		
		System.out.println(emp);
	}
}
