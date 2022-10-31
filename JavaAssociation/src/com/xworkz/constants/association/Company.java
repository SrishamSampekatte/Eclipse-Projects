package com.xworkz.constants.association;

public class Company {
	public String name;
	public String ownerName;
	public Address address;
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public void setAddress(Address address) {
		this.address=address;
		
	}
	public void showOff() {
		System.out.println("Printing Company Details");
		
		System.out.println(this.name);
		System.out.println(this.ownerName);
		
		if (address!=null) {
			this.address.showOff();
		}
		else {
			System.out.println(" Company is null");
		}
		

	}
	

}
