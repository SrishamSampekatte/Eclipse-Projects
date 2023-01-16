package com.xworkz.di.bean;


import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;

@Component
public class Petrol implements Fuel {
	//@Autowired
	//Fuel fuel;

	public Petrol() {
		System.out.println("Craeted petrol using no arg ");
	}

	@Override
	public void consume() {
		System.out.println("Running cosume in petrol ");

	}

}
