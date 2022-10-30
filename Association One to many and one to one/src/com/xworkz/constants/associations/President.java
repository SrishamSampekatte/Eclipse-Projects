package com.xworkz.constants.associations;

import com.xworkz.constants.enums.Gender;

public class President {
	public String name;
	public double tenure;
	public Gender gender;
	
	public President(String name, double tenure) {
		super();
		this.name = name;
		this.tenure = tenure;
	}
	
	public void setGender(Gender gender) {
		this.gender=gender;
		
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	}
	
	


}
