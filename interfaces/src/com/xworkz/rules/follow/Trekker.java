package com.xworkz.rules.follow;

import com.xworkz.rules.made.TrekkRule;

public class Trekker implements TrekkRule {

	@Override
	public String energy() {
		System.out.println("Need energy");
		return null;
	}

	@Override
	public String hill() {
		System.out.println("An advantage");
		return null;
	}

	@Override
	public boolean stamina() {
		System.out.println("Is must");
		return true;
	}

	@Override
	public boolean intrest() {
		System.out.println("is a plus");
		return true;
	}

	@Override
	public double distance() {
		System.out.println("Depends");
		return 0;
	}

}
