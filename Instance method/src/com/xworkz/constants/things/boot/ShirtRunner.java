package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt =new Shirt("Batte Angadi");
		shirt.size='M';
		shirt.setPrice(650);
		shirt.quantity=3;
		shirt.display();
		shirt.totalPrice();

	}

}
