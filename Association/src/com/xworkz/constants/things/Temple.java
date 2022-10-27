package com.xworkz.constants.things;

import com.xworkz.constants.things.association.God;

public class Temple {
	public String name;
	public String mainPriest;
	public int noOfVisitor;
	public int collectionPerDay;
	public God god;
	public Temple(String name, String mainPriest, int noOfVisitor, int collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitor = noOfVisitor;
		this.collectionPerDay = collectionPerDay;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitor);
		System.out.println(this.collectionPerDay);
		God god=new God("Sri ShambhuLingeshwara","Male","SuperPower");
		god.showOff();
	}
	
	

}
