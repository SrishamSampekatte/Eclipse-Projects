package com.xworkz.constants.things;


import com.xworkz.constants.Mavu;

public class Mango {
	public static String brand;
	public String name;
	public  Mavu mavu;
	public char size;
	public double price;
	public int quantity;
	
	public Mango(String name){
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
		System.out.println(Lamp.brand);
		System.out.println(this.name);
		System.out.println(Mavu.MALGOA);
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	static {
		Lamp.brand="king of Fruit";
	}


}
