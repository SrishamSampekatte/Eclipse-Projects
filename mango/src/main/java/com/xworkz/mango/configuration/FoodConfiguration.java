package com.xworkz.mango.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mango")
public class FoodConfiguration {
	public FoodConfiguration() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
}
