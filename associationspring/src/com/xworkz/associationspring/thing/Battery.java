package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private Capacity capacity;
	public Battery() {
		System.out.println("Created Battery ");
	}

}
