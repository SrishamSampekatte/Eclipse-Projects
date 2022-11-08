package com.xworkz.inheherit.thing;

public class Dowry {
	public String name;
	public DowryType varaDakshine;
	public boolean leagal;
	
	public Dowry() {
		System.out.println(" Default constructor of Dowry...");
		
	}

	public Dowry(String name, DowryType varaDakshine, boolean leagal) {
		super();
		this.name = name;
		this.varaDakshine = varaDakshine;
		this.leagal = leagal;
	}
	
}
