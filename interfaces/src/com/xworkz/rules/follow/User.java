package com.xworkz.rules.follow;

import com.xworkz.rules.made.CellPhone;

public class User implements CellPhone {

	@Override
	public String nameOfPhone() {
		System.out.println("Apple ");
		return null;
	}

	@Override
	public String modelOfPhone() {
		System.out.println("Iphone 14 pro max");
		return null;
	}

	@Override
	public String configOfPhone() {
		System.out.println("Complecated ");
		return null;
	}

	@Override
	public double priceOfPhone() {
		System.out.println("149999");
		return 0;
	}

	@Override
	public double yearOfPhone() {
		System.out.println("2022");
		return 0;
	}

}
