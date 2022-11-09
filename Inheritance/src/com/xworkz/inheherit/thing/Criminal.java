package com.xworkz.inheherit.thing;

public class Criminal {

	public String committed;
	public String gender;
	public boolean jail;

	public Criminal(String committed, String gender, boolean jail) {
		super();
		this.committed = committed;
		this.gender = gender;
		this.jail = jail;
	}

	public void display() {
		System.out.println(" Printing criminal details");
		System.out.println(this.committed);
		System.out.println(this.gender);
		System.out.println(this.jail);
	}

}
