package com.xworkz.constants.things;

import com.xworkz.constants.Deepa;

public class Lamp {
	public static String brand;
	public String name;
	public Deepa color;
	public char size;
	public double price;
	public int quantity;
	
	public Lamp(String name){
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
		System.out.println(Deepa.TOOGUDEEPA);
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	static {
		Lamp.brand="Pitambara";
	}


}
