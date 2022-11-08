package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Catering;

public class CateringChild extends Catering {
	public CateringChild() {
		System.out.println(" Default constructor of CateringChild");
	}

	public CateringChild(String name, String type, double price) {
		super(name, type, price);

	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
	}
}
