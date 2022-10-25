package com.xworkz.constants.things;

import com.xworkz.constants.Banna;

public class Shirt {
	public static String brand;
	public String name;
	public Banna color;
	public char size;
	public double price;
	public int quantity;
	
	public Shirt(String name){
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void totalPrice() {
		double totalPrice=this.price * this.quantity;
		System.out.println(totalPrice);
	} 
	public void display() {
		System.out.println(Shirt.brand);
		System.out.println(this.name);
		System.out.println(Banna.BLACK);
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	static {
		Shirt.brand="Levies";
	}
}
