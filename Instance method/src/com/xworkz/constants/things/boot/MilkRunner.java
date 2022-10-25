package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk milk =new Milk("Nandini",true);
		milk.quantity=5;
		milk.setPrice(45);
		
		milk.display();
		milk.totalPrice();
		

	}

}
