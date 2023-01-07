package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Mask {
	private String name;
	private String color;

	public Mask() {
		System.out.println("Created Mask using Spring");
	}

	public Mask(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mask [name=" + name + ", color=" + color + "]";
	}

}
