package com.xworkz.constants.association;

public class Location {
	public int no;
	public String street;
	public State state;
	public City city;
	public Country country;

	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}

	public void setLocation(Country country,State state, City city ) {
		this.state = state;
		this.city = city;
		this.country = country;

	}

	public void showOff() {
		System.out.println("Printing Location");
		System.out.println(this.no);
		System.out.println(this.street);

		if (this.state != null) {
			this.state.showOff();
		} else {
			System.out.println(" The state is null");
		}
		if (this.city != null) {
			this.city.showOff();
		} else {
			System.out.println("The city is null");
		}
		if (this.country != null) {
			this.country.showOff();
		} else {
			System.out.println("The country is null");
		}

	}
}
