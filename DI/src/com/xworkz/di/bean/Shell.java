package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Fuel;
import com.xworkz.di.bridge.Petrolbunk;

@Component
public class Shell implements Petrolbunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;// interface to achieve loose coupling

	public Shell() {
		System.out.println("Craeted shell using no arg ");
	}

	@Override
	public void purchase() {
		System.out.println("running purchase in shell ");
		fuel.consume();
	}

}
