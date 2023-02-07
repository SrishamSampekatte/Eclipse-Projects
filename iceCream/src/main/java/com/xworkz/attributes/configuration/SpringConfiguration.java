package com.xworkz.attributes.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.attributes")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}
