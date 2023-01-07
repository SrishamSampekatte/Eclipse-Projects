package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Area {
	private String name;
	private String state;

	public Area() {
		System.out.println("Created Area using Spring ");
	}

	public Area(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Area [name=" + name + ", state=" + state + "]";
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
}
