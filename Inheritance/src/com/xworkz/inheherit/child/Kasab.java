package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Terrorist;

public class Kasab extends Terrorist {
	@Override
	public void ugra() {
		System.out.println(" Printing ugra");
		System.out.println(" Printing ugra from Kasab");
	}

	public void shoot() {
		System.out.println(" Printing shot");
		System.out.println(" Printing Shoot from kasab");
	}

}
