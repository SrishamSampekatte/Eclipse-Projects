package com.xworkz.constants.things.boot;

import com.xworkz.constants.Facilities;
import com.xworkz.constants.things.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		Saloon saloon =new Saloon("Raghu");
		saloon.facilities=Facilities.FACIAL;
		saloon.setPrice(80);
		saloon.cuttingPrice=120;
		saloon.display();
		saloon.totalPrice();
		
		
		

	}

}
