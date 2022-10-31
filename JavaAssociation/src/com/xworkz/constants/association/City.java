package com.xworkz.constants.association;

public class City {
	
	public String name;
	public int noOfArea;
	public boolean capital;
	public String airQuality;
	public City(String name, int noOfArea, boolean capital, String airQuality) {
		super();
		this.name = name;
		this.noOfArea = noOfArea;
		this.capital = capital;
		this.airQuality = airQuality;
	}
	public void showOff() {
		System.out.println("Printing City Details");
		System.out.println(this.name);
		System.out.println(this.noOfArea);
		System.out.println(this.capital);
		System.out.println(this.airQuality);
	}

}
