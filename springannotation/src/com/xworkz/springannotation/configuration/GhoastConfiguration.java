package com.xworkz.springannotation.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.springannotation.bean.Engine;
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
				NewsPaper.class, MyWish.class, Pencil.class, Rubber.class, Software.class, SoftwareEngineer.class,
				EngineConfiguration.class, Engine.class }) })

public class GhoastConfiguration {
	public GhoastConfiguration() {
		System.out.println(" Created ghoast configuration using spring");
	}

	@Bean
	public String ghostName() {
		return "Naagavalli";
	}

	@Bean
	public String ghostLastName() {
		return "SM";
	}

	@Bean
	public int ghostAge() {
		return 25;
	}

	@Bean
	public LocalDate deathDate() {
		return LocalDate.of(2010, 03, 21);
	}

	@Bean
	public String ghostLocation() {
		return "Bengaluru";
	}

	@Bean
	public boolean isScary() {
		return true;
	}

	@Bean
	public String ghostFriendName() {
		return "Ganga";
	}

	@Bean
	public String ghostFavFood() {
		return "Biriyani";
	}

	@Bean
	public String ghostFavSports() {
		return "Kho-kho";
	}

	@Bean
	public String gender() {
		return "Female";
	}

	@Bean
	public String ghostFullName() {
		return "Naagavalli SM";
	}

	@Bean
	public int since() {
		return 1980;
	}

	@Bean
	public boolean hasLover() {
		return true;
	}

	@Bean
	public int numberOfLegs() {
		return 2;
	}

	@Bean
	public boolean isSucide() {
		return false;
	}

	@Bean
	public boolean bad() {
		return false;
	}

	@Bean
	public boolean good() {
		return true;
	}

	@Bean
	public double weight() {
		return 75;
	}

	@Bean
	public boolean thin() {
		return false;
	}

	@Bean
	public boolean fat() {
		return true;
	}
}
