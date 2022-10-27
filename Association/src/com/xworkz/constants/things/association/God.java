package com.xworkz.constants.things.association;

public class God {
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon;
	
	
	public God(String name, String gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
		
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
		Weapon weapon=new Weapon("Trishul","Samhra",5);
		weapon.showOff();
		
	}
	

}
