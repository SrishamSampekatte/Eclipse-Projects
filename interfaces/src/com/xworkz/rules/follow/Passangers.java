package com.xworkz.rules.follow;

import com.xworkz.rules.made.RailwayRule;

public class Passangers implements RailwayRule {

	@Override
	public String ticket() {
		System.out.println("Buy Tickets");
		return null;
	}

	@Override
	public String checking() {
		System.out.println("Show tickets to TC");
		return null;
	}

	@Override
	public int price() {
		System.out.println("depends on destination");
		return 0;
	}

	@Override
	public String destination() {
		System.out.println("end location");
		return null;
	}

	@Override
	public String departure() {
		System.out.println("Starting point");
		return null;
	}

}
