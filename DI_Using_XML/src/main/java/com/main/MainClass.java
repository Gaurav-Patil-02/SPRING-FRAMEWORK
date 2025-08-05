package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee emp = app.getBean(Employee.class);
		Country country = app.getBean(Country.class);
		
		country.setCountryCode("+91");
		country.setCountryName("India");
		
		emp.setId(10);
		emp.setName("Krishn");
		emp.setDesignation("Engineer");
		emp.setCon(country);
		
		
		System.out.println(emp);
	}
}
