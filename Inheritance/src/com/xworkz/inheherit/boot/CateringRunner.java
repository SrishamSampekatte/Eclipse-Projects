package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.CateringChild;
import com.xworkz.inheherit.thing.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering cat = new Catering("Marriage", "Veg", 85632);

		cat.showOff();
		
		CateringChild child=new CateringChild();
		child.showOff();

	}
	

}
