package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Experience {
	private Skill skill;

	public Experience() {
		System.out.println("Created Experience ");
	}

}
