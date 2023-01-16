package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Company {
	private Location location;
	private Area area;

	public Company() {
		System.out.println("Created no arg constructor ");

	}

	@Override
	public String toString() {
		return "Company [location=" + location + ", area=" + area + "]";
	}

}
