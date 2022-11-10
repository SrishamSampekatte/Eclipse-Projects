package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Home;

public class PayingGuest extends Home {
	@Override
	public void pay() {
		System.out.println(" Printing pay from Home");
		System.out.println(" Printing pay from Paying guest");
	}

	public void stay() {
		System.out.println(" Printing stay from home ");
		System.out.println(" Printing Stay from Paying guest");
	}
}
