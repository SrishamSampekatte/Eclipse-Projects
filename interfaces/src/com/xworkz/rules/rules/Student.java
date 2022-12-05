package com.xworkz.rules.follow;

import com.xworkz.rules.made.SchoolRule;

public class Student implements SchoolRule {

	@Override
	public String uniform() {
		System.out.println(" Wear uniform");
		return null;
	}

	@Override
	public String hairCoumb() {
		System.out.println("Comb hairs");
		return null;
	}

	@Override
	public String prayer() {
		System.out.println("Pray god");
		return null;
	}

	@Override
	public String attendence() {
		System.out.println("Maintain attendence");
		return null;
	}

	@Override
	public boolean shistu() {
		System.out.println("Teaches you shistu");
		return true;
	}

}
