package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Application {
	private String name;

	public Application() {
		System.out.println("Created Applicatin using spring ");
	}

	@Override
	public String toString() {
		return "Whatsapp";
	}

}
