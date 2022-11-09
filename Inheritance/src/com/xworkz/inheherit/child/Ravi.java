package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.Criminal;

public class Ravi extends Criminal {

	public int age;

	public Ravi(String committed, String gender, boolean jail, int age) {
		super(committed, gender, jail);
		this.age = age;
	}

	public void display() {
		System.out.println("Printing Ravi Details");
		super.display();
		System.out.println(this.age);
	}

}
