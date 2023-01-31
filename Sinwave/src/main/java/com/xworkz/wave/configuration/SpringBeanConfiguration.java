package com.xworkz.wave.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.wave")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("Created " + getClass().getSimpleName());
	}

}
