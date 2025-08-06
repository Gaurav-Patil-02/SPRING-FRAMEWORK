package com.spring.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements SIM{
	@Override
	public void calling() {
		System.out.println("Calling From Jio");
	}
}
