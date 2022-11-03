package com.xworkz.constants.boot;

import com.xworkz.constants.association.Address;
import com.xworkz.constants.association.City;
import com.xworkz.constants.association.Company;
import com.xworkz.constants.association.Country;
import com.xworkz.constants.association.Email;
import com.xworkz.constants.association.Job;
import com.xworkz.constants.association.Location;
import com.xworkz.constants.association.State;
import com.xworkz.constants.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person = new Person("Srisham");
		Email email = new Email("srishamsm@gmail.com", "Srisham123", 827773839L);

		Job job = new Job(1200000, "Software Developer", false);
		Company company = new Company("Google", "My google");
		Address address = new Address();
		Country country = new Country("India", "Delhi", 29, true);
		State state = new State("Karnataka", 30, true, 90000000);
		Location location = new Location(38, "marathalli");
		City city = new City("Banglore", 25, false, "Good");

		person.setJob(job);
		person.setCompany(company);

		email.setCompany(company);
		company.setAddress(address);
		address.setAddress(location);
		location.setLocation(country, state, city);

		Email[] emails = { email };
		person.setEmail(emails);

		person.showOff();

	}

}
