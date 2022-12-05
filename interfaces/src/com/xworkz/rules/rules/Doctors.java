package com.xworkz.rules.follow;

import com.xworkz.rules.made.OperationTheater;

public class Doctors implements OperationTheater {

	@Override
	public String mask() {
		System.out.println(" Doctors should wear mask");
		return null;
	}

	@Override
	public String hygenic() {
		System.out.println("Should be hygenic");
		return null;
	}

	@Override
	public boolean fast() {
		System.out.println("Doctors should try to complete operation quickly");
		return false;
	}

	@Override
	public String silence() {
		System.out.println("Theates should be in silence");
		return null;
	}

	@Override
	public boolean isolation() {
		System.out.println("Patients should be isolated ");
		return true;
	}

}
