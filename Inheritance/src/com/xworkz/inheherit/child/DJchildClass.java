package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Dj;

public class DJchildClass extends Dj {
	public DJchildClass() {
		System.out.println(" Default constructor of  djChild class ");
	}

	public DJchildClass(String name, double payment, String noOfDj) {
		super(name, payment, noOfDj);
	}
}
