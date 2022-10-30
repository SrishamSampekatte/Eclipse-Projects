package com.xworkz.constants.things;

import com.xworkz.constants.associations.City;
import com.xworkz.constants.associations.President;
import com.xworkz.constants.enums.Gender;

public class Country {

	public String name;
	public  President president;

	public Gender gender;
	public City[] cities;

	public Country(String name) {
		super();
		this.name = name;
	}

	public void setPresident(President president) {
		this.president = president;

	}

	public void setCity(City[] cities) {
		this.cities = cities;

	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println("Printing details after checking");

		System.out.println(this.name);

		if (this.president != null) {
			System.out.println(this.name);
			this.president.showOff();
		} else {
			System.out.println("President is null ");
		}
		
		
		if (this.cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				System.out.println(city);
				city.showOff();
			}
		}
		else {
			System.out.println("city is null");
		}
		System.out.println(this.gender);

	}


}
