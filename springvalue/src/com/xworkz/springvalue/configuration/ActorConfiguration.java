package com.xworkz.springvalue.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springvalue")
public class ActorConfiguration {
	public ActorConfiguration() {
		System.out.println("Created actor configuration ");
	}

}
