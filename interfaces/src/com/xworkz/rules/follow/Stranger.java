package com.xworkz.rules.follow;

import com.xworkz.rules.made.Lodge;

public class Stranger implements Lodge {

	@Override
	public String name() {
		System.out.println("Say so");
		return null;
	}

	@Override
	public String identity() {
		System.out.println("cOLLECTS");
		return null;
	}

	@Override
	public String specialRoom() {
		System.out.println("yes");
		return null;
	}

	@Override
	public boolean hotWater() {
		System.out.println("Available");
		return true;
	}

	@Override
	public boolean cheap() {
		System.out.println("economical");
		return true;
	}

}
