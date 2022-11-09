package com.xworkz.inheherit.thing;

public class ShoppingMall {
	public String location;
	public int noOfShops;
	public int postlCode;
	
	public ShoppingMall(String location, int noOfShops, int postlCode) {
		super();
		this.location = location;
		this.noOfShops = noOfShops;
		this.postlCode = postlCode;
	}
	public void display() {
		System.out.println(" Printing Shopping mall details");
		System.out.println(this.location);
		System.out.println(this.noOfShops);
		System.out.println(this.postlCode);
	}
	

}
