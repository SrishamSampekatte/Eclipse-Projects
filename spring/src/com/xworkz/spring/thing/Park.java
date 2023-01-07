package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Park {
	private String name;

	public Park() {
		System.out.println("Created park using spring");
	}

	@Override
	public String toString() {
		return "Mariyappanapallya";
	}

}
