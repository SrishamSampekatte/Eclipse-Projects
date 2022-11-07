package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Doctor;

public class Dentist extends Doctor {

	public int age;
	public String location;

	public Dentist() {
		super();
		System.out.println("Printing Dentist details");
	}

}
