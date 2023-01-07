package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class City {
	private String name;
	private String state;

	public City() {
		System.out.println("Created City using Spring");
	}

	public City(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", state=" + state + "]";
	}

}
