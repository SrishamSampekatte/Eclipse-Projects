package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Provider;

@Component
public class Jio implements Provider {
	//@Autowired
	//@Qualifier("chrome")
	//private Chrome chrome;

	public Jio() {
		System.out.println("Craeted Jio using no arg constructor ");
	}

	@Override
	public void connect() {
		System.out.println("Running connect in Jio");
		//chrome.browse();

	}

}
