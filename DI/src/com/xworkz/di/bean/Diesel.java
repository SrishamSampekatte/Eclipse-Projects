package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;

@Component
public class Diesel implements Fuel {

	public Diesel() {
		System.out.println("Craeted diesel");
	}

	@Override
	public void consume() {
		System.out.println("Running consume from diesel ");

	}

}
