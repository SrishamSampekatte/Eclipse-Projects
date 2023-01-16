package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Lens {
	private Battery battery;

	public Lens() {
		System.out.println("Created lens by no arg cons");
	}
}
