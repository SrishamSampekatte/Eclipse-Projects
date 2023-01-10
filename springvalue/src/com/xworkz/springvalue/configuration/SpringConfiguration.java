package com.xworkz.springvalue.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springvalue.thing.Actor;
import com.xworkz.springvalue.thing.Rocket;
import com.xworkz.springvalue.thing.Season;

@Configuration
@ComponentScan("com.xworkz.springvalue")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created Spring configuration using Spring ");
	}

	@Bean
	public Rocket pegasus() {
		System.out.println("Created pegasus rocket using Bean");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Rocket aryabhata() {
		System.out.println("Created pegasus rocket using Bean");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Rocket insat() {
		System.out.println("Created pegasus rocket using Bean");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Rocket proton() {
		System.out.println("Created pegasus rocket using Bean");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Rocket reffel() {
		System.out.println("Created pegasus rocket using Bean");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor cruise() {
		System.out.println("Created cruise actor using Bean");
		Actor actor = new Actor("Tom Cruise", "English", 59);
		return actor;
	}

	@Bean
	public Actor tony() {
		System.out.println("Created Tony actor using Bean");
		Actor actor = new Actor("Toney", "English", 45);
		return actor;
	}

	@Bean
	public Actor rock() {
		System.out.println("Created Rock actor using Bean");
		Actor actor = new Actor("Dwayne Johnson", "English", 50);
		return actor;
	}

	@Bean
	public Actor yash() {
		System.out.println("Created Yash actor using Bean");
		Actor actor = new Actor("Naveen Kumar", "Kannada", 33);
		return actor;
	}

	@Bean
	public Actor appu() {
		System.out.println("Created Appu actor using Bean");
		Actor actor = new Actor("Puneeth Raj Kumar", "Kannada", 48);
		return actor;
	}

	@Bean
	public Season summer() {
		System.out.println("Created Summer using Bean");
		Season season = new Season();
		season.setName("Summer");
		season.setStartingMonth("Feb");
		season.setDuration(3);
		return season;
	}

	@Bean
	public Season rainy() {
		System.out.println("Created Rainy using Bean");
		Season season = new Season();
		season.setName("Rainy Season");
		season.setStartingMonth("June");
		season.setDuration(3);
		return season;
	}

	@Bean
	public Season automn() {
		System.out.println("Created Automn using Bean");
		Season season = new Season();
		season.setName("Automn Season");
		season.setStartingMonth("March");
		season.setDuration(2);
		return season;
	}

}
