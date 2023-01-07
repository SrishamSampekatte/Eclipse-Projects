package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Cycle {

	private String brand;

	public Cycle() {
		System.out.println("Created Cycle using spring ");
	}

	@Override
	public String toString() {
		return "Herculus";
	}

}
