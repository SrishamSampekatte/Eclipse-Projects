package com.xworkz.constants.things;

import com.xworkz.constants.Facilities;

public class Saloon {
	
	public static String name;
	public String ownerName;
	public Facilities facilities;
	public int shavingPrice;
	public int cuttingPrice;
	public String location="Sampekatte";
	
	public Saloon(String ownerName) {
		this.ownerName=ownerName;
	}
	
	public void setPrice( int shavingPrice) {
		this.shavingPrice=shavingPrice;
		
	}
	
	public void totalPrice() {
		double totalPrice=this.cuttingPrice + this.shavingPrice;
		System.out.println(totalPrice);
	}
	
	public void display() {
		System.out.println(Saloon.name);
		System.out.println(this.ownerName);
		System.out.println(this.facilities);
		System.out.println(this.shavingPrice);
		System.out.println(this.cuttingPrice);
		
	}
	
	static {
		Saloon.name="Stylish hair dresses";
	}
	

	

}
