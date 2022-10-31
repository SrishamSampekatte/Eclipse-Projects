package com.xworkz.constants.association;

public class Address {
	public Location location;

	public Address() {
		super();
	}

	public void setAddress(Location location) {
		this.location = location;

	}

	public void showOff() {
		System.out.println("Printing adress details");
		if (this.location != null) {
			this.location.showOff();
		} else {
			System.out.println(" Address is null");
		}
	}

}
