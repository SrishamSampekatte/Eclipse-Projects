package com.xworkz.di.bean;

import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Browser;

@Component
public class FireBox implements Browser {

	public FireBox() {
		System.out.println("Created firebox using no arg constructor ");
	}

	@Override
	public void browse() {
		System.out.println("Running browse in FireBox... ");

	}

}
