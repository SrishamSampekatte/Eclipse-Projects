package com.xworkz.constants.things;

import com.xworkz.constants.Type;

public class Cracker {
	public static String brand;
	public String name;
	public int quantity;
	public Type type;
	public double price;
	public boolean pollution;
	
	
	public Cracker(String name,boolean pollution){
		this.name=name;
		this.pollution=pollution;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	 public void patakiHachhi() {
		 System.out.println(Cracker.brand);
		 System.out.println(this.name);
		 System.out.println(Type.GARNAL);
		 System.out.println(this.quantity);
		 System.out.println(this.price);
		 System.out.println(this.pollution);
		 
	 }
	 
	 static {
		 Cracker.brand="Patakies";
	 }
	 public void setTotalPrice() {
			
			double totalPrice= this.price * this.quantity;
			System.out.println("Total price is :" +totalPrice);
			
	 }

}
