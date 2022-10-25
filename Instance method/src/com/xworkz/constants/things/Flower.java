package com.xworkz.constants.things;

import com.xworkz.constants.Variety;

public class Flower {
	public static String name;
	public String color;
	public Variety type=Variety.CHEND_HUVA;
	public double price;
	public int qunatity;
	
	
	public Flower(String color) {
		this.color=color;
		
	}
	
	public void setPrice( int price) {
		this.price=price;
	}
	
	public void totalPrice(){
		double totalPrice=this.price * this.qunatity;
		System.out.println(totalPrice);
	}
	
	public void dispaly() {
		System.out.println(Flower.name);
		System.out.println(this.type);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.qunatity);
	}
	static {
		Flower.name="Red";
	}
	
	

}
