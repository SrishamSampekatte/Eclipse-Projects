package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.Lamp;

public class DeepaRunner {

	public static void main(String[] args) {

			Lamp deepa =new Lamp("Deepadangadi");
			deepa.size='M';
			deepa.setPrice(1650);
			deepa.quantity=3;
			deepa.display();
			deepa.totalPrice();

	}

}
