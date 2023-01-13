package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private String type;
	private boolean posionous;

	public Snake() {
		System.out.println("Registered Snake ");
	}

	@Autowired
	public Snake(@Qualifier("snakeName") String name, @Qualifier("snakeType") String type,
			@Qualifier("snakePoisonous") boolean posionous) {
		super();
		this.name = name;
		this.type = type;
		this.posionous = posionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", posionous="
				+ posionous + "]";
	}

}
