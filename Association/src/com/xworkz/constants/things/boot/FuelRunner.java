package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.association.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		
		Fuel fuel=new Fuel( false,103.6);
		fuel.showOff();
		fuel.setPrice();

	}

}

