package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private Director director;
	private Experience experience;
	private CameraMan cameraman;
	public Movie() {
		System.out.println("Created movie using above properties ");
	}

}
