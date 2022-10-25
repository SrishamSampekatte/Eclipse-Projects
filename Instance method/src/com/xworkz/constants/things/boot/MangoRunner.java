package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango mango =new Mango("Deepadangadi");
		mango.size='M';
		mango.setPrice(80);
		mango.quantity=3;
		mango.display();
		mango.totalPrice();


	}

}
