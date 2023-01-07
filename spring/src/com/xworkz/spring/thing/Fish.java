package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Fish {
	private String name;
	private char size;

	public Fish() {
		System.out.println(" Created Fish using spring  ");
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", size=" + size + "]";
	}

	public Fish(String name, char size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

}
