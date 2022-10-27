package com.xworkz.constants.things.association;

import com.xworkz.constants.Type;
import com.xworkz.constants.things.Brand;

public class Fuel {
	
	
	public boolean special;
	public Type type;//enum
	public double price;
	public double quantity=6;
	public Brand brand;// association 
	
	//LInk brand to fuel

	
	
	
	public Fuel(boolean special, double price) {
		super();
		this.special = special;
		this.price = price;

	}
	
	public void setPrice() {
		
		double totalPrice=this.price* this.quantity;
		System.out.println(totalPrice);
		
	}
	
	public void showOff() {
		System.out.println(this.special);
		System.out.println(Type.PETROL);
		System.out.println(this.price);
		System.out.println(this.quantity);
		Brand brand=new Brand("ESSAR","GST1243456","*****");
		brand.showOff();
		
	}
	
	
	

}
