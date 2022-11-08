package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Dowry;
import com.xworkz.inheherit.thing.DowryType;

public class DowryChild extends Dowry {
	public DowryChild() {
		System.out.println(" Default constructor of dowry child class ..");
	}

	public DowryChild(String name, DowryType varaDakshine, boolean leagal) {
		super(name, varaDakshine, leagal);

	}

}
