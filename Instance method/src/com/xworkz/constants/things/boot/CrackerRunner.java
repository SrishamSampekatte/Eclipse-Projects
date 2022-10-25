package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		Cracker cracker = new Cracker("A-one",true);
		cracker.setQuantity(15);
		cracker.price=38;
		
		cracker.patakiHachhi();
		cracker.setTotalPrice();

	}

}
