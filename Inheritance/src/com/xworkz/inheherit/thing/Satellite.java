package com.xworkz.inheherit.thing;

public class Satellite {
	public String name;
	public String usage;
	public boolean natural;
	public Satellite(String name, String usage, boolean natural) {
		super();
		this.name = name;
		this.usage = usage;
		this.natural = natural;
	}
	public void display() {
		System.out.println(" Printing details of Satellite");
		System.out.println(this.name);
		System.out.println(this.usage);
		System.out.println(this.natural);
	}

}
