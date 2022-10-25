package com.xworkz.constants.things;

import com.xworkz.constants.Sweets;

public class Sweet {
	
	public static String brand;
	public int since;
	public Sweets sweet=Sweets.MYSORE_PAK;
	public int quantity=25;
	public double price;
	public String location;
	
	
	public Sweet(int since) {
		this.since= since;
		
	}
	
	public void setPrice(double price) {
		this.price=price;
		}
	
	public void display() {
		
		System.out.println(Sweet.brand);
		System.out.println(this.since);
		System.out.println(this.sweet);
		System.out.println(this.location);
		System.out.println(this.quantity);
		System.out.println(this.price);
		
				
	}
    	
		
		static {
			Sweet.brand="Venkateshwara Sweets";
			
		}
		public void displayTotalPrice() {
			
			double total=quantity * this.price;
			System.out.println("Total price of the sweet is "+ total);
		}
	

}
