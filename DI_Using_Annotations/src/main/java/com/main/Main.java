package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.Configurations;
import com.entity.Country;
import com.entity.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
		Employee e = context.getBean(Employee.class);
		Country c = context.getBean(Country.class);
				
		c.setCountryCode(+91);
		c.setCountryName("IND");
		
		e.setId(10);
		e.setName("Gaurav");
		e.setDesignation("Software Developer");
		e.setCountry(c);
		
		System.out.println(e);
	}
}
