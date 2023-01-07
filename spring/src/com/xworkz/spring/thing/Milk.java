package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	private String color;
	private String source;

	public Milk() {
		System.out.println("Created Milk using spring ");
	}

	public Milk(String color, String source) {
		super();
		this.color = color;
		this.source = source;
	}

	@Override
	public String toString() {
		return "Milk [color=" + color + ", source=" + source + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
