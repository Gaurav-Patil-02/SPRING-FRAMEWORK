package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Users {

	@Qualifier("airtel")
	@Autowired

	private SIM sim1;

	@Qualifier("jio")
	@Autowired

	private SIM sim2;

	public SIM getSim1() {
		return sim1;
	}

	public void setSim1(SIM sim1) {
		this.sim1 = sim1;
	}

	public SIM getSim2() {
		return sim2;
	}

	public void setSim2(SIM sim2) {
		this.sim2 = sim2;
	}

	@Override
	public String toString() {
		return "Users [sim1=" + sim1 + ", sim2=" + sim2 + "]";
	}

}
