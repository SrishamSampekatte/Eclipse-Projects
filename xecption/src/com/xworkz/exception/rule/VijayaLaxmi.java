package com.xworkz.exception.rule;

public class VijayaLaxmi extends JavaTrainee implements KarnatakaRto {

	public VijayaLaxmi(String name, String location, int age, String branch, String collegeName) {
		super(name, location, age, branch, collegeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean paidTax(double payTax) {
		System.out.println("Running payTax");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("Running gst");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("Running vat ");
		return 0;
	}

}
