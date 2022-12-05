package com.xworkz.rules.follow;

import com.xworkz.rules.made.Xworkz;

public class Trainee implements Xworkz{

	@Override
	public String Timings() {
		System.out.println("9am o 11 am");
		return null;
	}

	@Override
	public String trainer() {
		System.out.println("OM");
		return null;
	}

	@Override
	public boolean presentation() {
		System.out.println("Compulsary");
		return false;
	}

	@Override
	public boolean strict() {
		System.out.println("Friendly strict");
		return true;
	}

	@Override
	public double fee() {
		System.out.println("22k");
		return 0;
	}

}
