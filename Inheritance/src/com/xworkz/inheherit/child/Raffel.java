package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Warjet;

public class Raffel extends Warjet {
	@Override
	public void fight() {
		System.out.println(" Printing fight from warjet");
		System.out.println(" Printing fight from raffel");

	}

	public void bomb() {
		System.out.println(" Printong bomb from warjet");
		System.out.println(" Printing bomb from raffel");
	}
}
