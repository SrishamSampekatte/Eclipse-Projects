package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class BakeryApplicationConfiguration {
	public BakeryApplicationConfiguration() {
		System.out.println("Created" + getClass().getSimpleName());
	}

}
