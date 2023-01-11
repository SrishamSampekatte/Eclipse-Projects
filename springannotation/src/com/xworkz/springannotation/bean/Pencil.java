package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pencil {
	@Autowired
	@Qualifier("nameOfPencil")
	private String name;
	@Autowired
	@Qualifier("typeOfPencil")
	private String type;
	@Autowired
	@Qualifier("priceOfPencil")
	private double price;
	@Autowired
	@Qualifier("colorOfPencil")
	private String color;
	@Autowired
	@Qualifier("sharpnessOfPencil")
	private boolean sharp;
	@Autowired
	@Qualifier("stolenPencil")
	private boolean stolen;

	public Pencil() {
		System.out.println("Created Pencil using Spring ");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
