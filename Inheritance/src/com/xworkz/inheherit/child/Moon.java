package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Satellite;

public class Moon extends Satellite {
	public double size;

	public Moon(String name, String usage, boolean natural, double size) {
		super(name, usage, natural);
		this.size = size;
	}
	public void display() {
		System.out.println(" Printing moon details");
		super.display();
		System.out.println(this.size);
	}
	
	
	
	

}
