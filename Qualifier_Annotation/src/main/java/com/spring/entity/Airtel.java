package com.spring.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements SIM {
	@Override
	public void calling() {
		System.out.println("Calling From Airtel");
	}
}
