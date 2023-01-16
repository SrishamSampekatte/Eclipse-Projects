package com.xworkz.di.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.di.bean.Diesel;
import com.xworkz.di.bean.Petrol;
import com.xworkz.di.bean.Shell;

@Configuration
@ComponentScan(basePackages = "com.xworkz.di", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { SpringConfiguration.class, Diesel.class,
				Petrol.class, Shell.class }) })
public class BrowserConfiguration {
	public BrowserConfiguration() {
		System.out.println("Crated config class using spring ");
	}

}
