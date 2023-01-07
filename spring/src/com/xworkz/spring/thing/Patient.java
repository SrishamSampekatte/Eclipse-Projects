package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private String Name;
	private String desease;

	public Patient() {
		System.out.println("Craeted Patient using Spring");
	}

	public Patient(String name, String desease) {
		super();
		Name = name;
		this.desease = desease;
	}

	@Override
	public String toString() {
		return "Patient [Name=" + Name + ", desease=" + desease + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesease() {
		return desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

}
