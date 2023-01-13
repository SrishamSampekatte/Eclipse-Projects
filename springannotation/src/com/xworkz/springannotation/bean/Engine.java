package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	@Autowired
	@Qualifier("engineVersion")
	private double version;
	@Autowired
	@Qualifier("engineNumber")
	private int number;
	private String type;
	private String company;
	private int strokes;

	public Engine() {
		System.out.println("Registered Engine using spring ");
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", version=" + version + ", number=" + number + ", type=" + type + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	public int getStrokes() {
		return strokes;
	}

}
