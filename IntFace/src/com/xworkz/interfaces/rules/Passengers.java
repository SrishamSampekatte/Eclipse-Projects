package com.xworkz.interfaces.rules;

public class Passengers implements AirportRules {

	@Override
	public boolean cheking() {
System.out.println("Running Checking ....");
		return false;
	}

	@Override
	public int boardingOnTime() {
		System.out.println("Running boardingOnTime ...");
		return 0;
	}

}
