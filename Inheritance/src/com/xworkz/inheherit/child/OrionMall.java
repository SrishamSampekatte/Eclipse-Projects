package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.ShoppingMall;

public class OrionMall extends ShoppingMall {
	public int cost;

	public OrionMall(String location, int noOfShops, int postlCode, int cost) {
		super(location, noOfShops, postlCode);
		this.cost = cost;
	}
	public void display() {
		System.out.println(" Printing child class or orion mall details ");
		super.display();
		System.out.println(this.cost);
	}
	
	

}
