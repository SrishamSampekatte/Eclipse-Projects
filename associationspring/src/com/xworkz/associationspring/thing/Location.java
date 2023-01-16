package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Location {
	private Area area;

	public Location() {
		System.out.println("Created location using spring ");
	}
}
