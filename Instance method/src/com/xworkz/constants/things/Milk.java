package com.xworkz.constants.things;

import com.xworkz.constants.Color;

public class Milk {
	
	public static String brand;
	public String name;
	public Color packetColor;
	public int price;
	public int quantity;
	public boolean healthy;
	
	
	public Milk(String name,boolean healthy) {
		this.name=name;
		this.healthy=healthy;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void display() {
		System.out.println(Milk.brand);
		System.out.println(this.name);
		System.out.println(this.healthy);
		System.out.println(Color.ORANGE);
		System.out.println(this.price);
		System.out.println(this.quantity);
		
		}
	
	static {
		Milk.brand="Shimul";
	}
	public void totalPrice() {
		int totalPrice= this.price * this.quantity;
		System.out.println(totalPrice);
	}
	
}
