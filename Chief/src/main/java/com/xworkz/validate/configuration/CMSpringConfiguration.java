package com.xworkz.validate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class CMSpringConfiguration {
	public CMSpringConfiguration() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("registering ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	
}
