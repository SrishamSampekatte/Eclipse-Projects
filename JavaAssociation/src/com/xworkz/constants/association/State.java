package com.xworkz.constants.association;

public class State {
	public String name;
	public int noOfDistrict;
	public boolean cold;
	public int population;
	public State(String name, int noOfDistrict, boolean cold, int population) {
		super();
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.cold = cold;
		this.population = population;
	}
	
	public void showOff() {
		System.out.println("Printing State Details");
		System.out.println(this.name);
		System.out.println(this.noOfDistrict);
		System.out.println(this.cold);
		System.out.println(this.population);
	}

}
