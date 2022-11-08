package com.xworkz.inheherit.thing;

public class Catering {
	public String name;
	public String type;
	public double price;

	public Catering() {
		System.out.println(" Default constructor of Catering ");
	}

	public Catering(String name, String type, double price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
	}

}
