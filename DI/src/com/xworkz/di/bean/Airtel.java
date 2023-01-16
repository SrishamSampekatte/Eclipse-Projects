package com.xworkz.di.bean;

import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("Craeted Airtel using no arg constructor ");
	}

	@Override
	public void connect() {
		System.out.println("running connect in Airtel..");

	}

}
