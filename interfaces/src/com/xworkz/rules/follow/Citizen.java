package com.xworkz.rules.follow;

import com.xworkz.rules.made.TrafficRule;

public class Citizen implements TrafficRule {

	@Override
	public String Seatbelt() {
		System.out.println(" Wear seat belt");
		return null;
	}

	@Override
	public String documents() {
		System.out.println("Should carry all the documents");
		return null;
	}

	@Override
	public boolean followOneway() {
		System.out.println("Should not go in one way");
		return true;
	}

	@Override
	public boolean helmet() {
		System.out.println("Should wear helmet for the safty");
		return true;
	}

	@Override
	public boolean speedLimit() {
		System.out.println(" Maintain speed");
		return true;
	}

}
