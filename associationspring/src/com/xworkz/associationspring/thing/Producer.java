package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Producer {
	private Assistant assistant;
	private Location location;
	private Area area;

	public Producer() {
		System.out.println("Created Producer using spring ");
	}

}
