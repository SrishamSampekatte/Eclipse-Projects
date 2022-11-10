package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.PetrolBunk;

public class Venkateshwara extends PetrolBunk {
	@Override
	public void fuel() {
		System.out.println(" Printing first method perent ");
		System.out.println(" Printing Petrol bunk from Venkateshwara");
	}
	public void petrol() {
		System.out.println(" Printing petrol");
		System.out.println(" Printing fuel from Venkateshwara");
	}

}
