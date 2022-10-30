package com.xworkz.constants.associations;

public class Name {
	
	public String pastName;
	public String presentName;
	public String futureName;
	
	
	public Name(String pastName, String presentName, String futureName) {
		super();
		this.pastName = pastName;
		this.presentName = presentName;
		this.futureName = futureName;
	}
	
	public void showOff() {
		System.out.println(this.pastName);
		System.out.println(this.presentName);
		System.out.println(this.futureName);
	}
	
	

}
