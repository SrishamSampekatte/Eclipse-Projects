package com.xworkz.constants.association;

public class Country {
	
	public String name;
	public String capitalCity;
	public int noOfState;
	public boolean developed;
	public Country(String name, String capitalCity, int noOfState, boolean developed) {
		super();
		this.name = name;
		this.capitalCity = capitalCity;
		this.noOfState = noOfState;
		this.developed = developed;
	}
	 public void showOff() {
		 
		 System.out.println("Printing Country Details");
		 System.out.println(this.name);
		 System.out.println(this.capitalCity);
		 System.out.println(this.noOfState);
		 System.out.println(this.developed);
	 }
	

}
