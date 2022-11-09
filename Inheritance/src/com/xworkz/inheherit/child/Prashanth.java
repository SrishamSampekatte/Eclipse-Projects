package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Director;

public class Prashanth extends Director {
	public String secondMovie;

	public Prashanth(String name, String firstMovie, boolean hit, String secondMovie) {
		super(name, firstMovie, hit);
		this.secondMovie = secondMovie;
	}

	public void display() {
		System.out.println(" Printing details of Prashanth");
		super.display();
		System.out.println(this.secondMovie);

	}

}
