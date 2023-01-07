package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Mall {
	private String name;

	public Mall() {
		System.out.println("Created Mall using spring ");
	}

	@Override
	public String toString() {
		return "Orion ";
	}

}
