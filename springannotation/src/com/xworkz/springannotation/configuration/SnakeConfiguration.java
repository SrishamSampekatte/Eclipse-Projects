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
import com.xworkz.springannotation.bean.Software;
import com.xworkz.springannotation.bean.SoftwareEngineer;

@Configuration

@ComponentScan(basePackages = "com.xworkz.springannotation", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { SpringConfiguration.class,
				NewsPaperConfiguration.class, HardwareShop.class, NewsPaper.class, MyWish.class, Pencil.class,
				Rubber.class, Software.class, SoftwareEngineer.class }) })

public class SnakeConfiguration {
	public SnakeConfiguration() {
		System.out.println("Snake configuration created");
	}

	@Bean
	public String snakeName() {
		System.out.println("Registered Snake Name using Spring");
		String ref = new String("King Cobra");
		return ref;
	}

	@Bean
	public double snakeLength() {
		System.out.println("Registered Snake Length using Spring");
		double ref = new Double(11.11);
		return ref;
	}

	@Bean
	public String snakeColor() {
		System.out.println("Registered Snake Color using Spring");
		String ref = new String("Black");
		return ref;
	}

	@Bean
	public String snakeType() {
		System.out.println("Registered Snake Type using Spring");
		String ref = new String("Venomous");
		return ref;
	}

	@Bean
	public boolean snakePoisonous() {
		System.out.println("Registered Snake Vishana ?");

		return true;
	}

}
