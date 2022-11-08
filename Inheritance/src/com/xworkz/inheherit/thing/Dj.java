package com.xworkz.inheherit.thing;

public class Dj {
	public String name;
	public double payment;
	public String noOfDj;

	public Dj() {
		System.out.println(" Printing DJ details ");

	}

	public Dj(String name, double payment, String noOfDj) {
		super();
		this.name = name;
		this.payment = payment;
		this.noOfDj = noOfDj;
	}
	
}
