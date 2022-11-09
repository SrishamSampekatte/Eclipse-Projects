package com.xworkz.inheherit.thing;

public class Director {
	public String name;
	public String firstMovie;
	public boolean hit;

	public Director(String name, String firstMovie, boolean hit) {
		super();
		this.name = name;
		this.firstMovie = firstMovie;
		this.hit = hit;
	}

	public void display() {
		System.out.println("Printing director details");
		System.out.println(this.name);
		System.out.println(this.firstMovie);
		System.out.println(this.hit);
	}

}
