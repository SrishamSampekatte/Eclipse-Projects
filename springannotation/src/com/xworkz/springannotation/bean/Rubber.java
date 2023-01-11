package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("nameOfRubber")
	private String name;
	@Autowired
	@Qualifier("typeOfRubber")
	private String type;
	@Autowired
	@Qualifier("priceOfRubber")
	private double price;
	@Autowired
	@Qualifier("colorOfRubber")
	private String color;
	@Autowired
	@Qualifier("shapeOfRubber")
	private String shape;
	@Autowired
	@Qualifier("stolenRubber")
	private boolean stolen;
	@Autowired
	@Qualifier("sizeOfRubber")
	private char size;

	public Rubber() {
		System.out.println("Created Rubber using Spring ");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}
