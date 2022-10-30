package com.xworkz.constants.boot;

import com.xworkz.constants.associations.City;
import com.xworkz.constants.associations.Name;
import com.xworkz.constants.associations.President;
import com.xworkz.constants.enums.Gender;
import com.xworkz.constants.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
		Country country=new Country("India");
		President president=new President("Droupadi Murmu", 5);
		president.setGender(Gender.FEMALE);
		country.setPresident(president);
		
		Name name1=new Name("Bharata Khande","Hindusthan","India");
		City city=new City(name1);
		city.setAreaInSqKm(362);
		city.setCapital(true);

		Name name2 = new Name("bharat", "india", "non Predictable");
		City city2 = new City(name2);
		city2.setAreaInSqKm(653);
		city2.setCapital(false);

		City[] cities = { city, city2 };
		country.setCity(cities);

		country.display();
		
		
		
		
		

	}

}
