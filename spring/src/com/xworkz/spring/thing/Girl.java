package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Girl {
	private String name;
	private String degree;

	public Girl() {
		System.out.println(" Created Girl using spring");
	}

	public Girl(String name, String degree) {
		super();
		this.name = name;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", degree=" + degree + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

}
