package com.xworkz.springannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.springannotation.bean.HardwareShop;
import com.xworkz.springannotation.bean.MyWish;
import com.xworkz.springannotation.bean.NewsPaper;
import com.xworkz.springannotation.bean.Pencil;
import com.xworkz.springannotation.bean.Rubber;
import com.xworkz.springannotation.bean.Snake;
import com.xworkz.springannotation.bean.Software;
import com.xworkz.springannotation.bean.SoftwareEngineer;

@Configuration

@ComponentScan(basePackages = "com.xworkz.springannotation", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { SpringConfiguration.class,
				NewsPaperConfiguration.class, SnakeConfiguration.class, Snake.class, HardwareShop.class,
				NewsPaper.class, MyWish.class, Pencil.class, Rubber.class, Software.class, SoftwareEngineer.class }) })

public class EngineConfiguration {
	public EngineConfiguration() {
		System.out.println("Created Engine config using Spring ");
	}

	@Bean
	public String engineName() {
		System.out.println("Registered Engine Name using Spring");
		String ref = new String("Special edition ");
		return ref;
	}

	@Bean
	public double engineVersion() {
		System.out.println("Registered Engine version using Spring");
		double ref = new Double(4.2);
		return ref;
	}

	@Bean
	public String engineType() {
		System.out.println("Registered Engine Type using Spring");
		String ref = new String("Diesel");
		return ref;
	}

	@Bean
	public int engineNumber() {
		System.out.println("Registered Engine number using Spring");

		return 65;
	}

	@Bean
	public String engineCompany() {
		System.out.println("Registered Engine company using Spring");
		String ref = new String("Harley davidson");
		return ref;
	}

	@Bean
	public int engineStrokes() {
		System.out.println("Registered Engine Strokesusing Spring");
		return 2;
	}

}
