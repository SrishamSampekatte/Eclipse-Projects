package com.xworkz.springannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.springannotation.bean.HardwareShop;
import com.xworkz.springannotation.bean.MyWish;
import com.xworkz.springannotation.bean.Pencil;
import com.xworkz.springannotation.bean.Rubber;
import com.xworkz.springannotation.bean.Software;
import com.xworkz.springannotation.bean.SoftwareEngineer;


@Configuration					

@ComponentScan(basePackages = "com.xworkz.springannotation", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { SpringConfiguration.class,
				HardwareShop.class, MyWish.class, Pencil.class, Rubber.class, Software.class,
				SoftwareEngineer.class }) })

public class NewsPaperConfiguration {
	public NewsPaperConfiguration() {
		System.out.println(" created config cconstructor");
	}

	@Bean
	public int paperId() {
		System.out.println("Registering id using Spring ");
		return 99;
	}

	@Bean
	public String paperName() {
		System.out.println("Registered papaer Name using Spring");
		String ref = new String("Prajavani");
		return ref;
	}

	@Bean
	public String paperOwner() {
		System.out.println("Registered papaer owner Name using Spring");
		String ref = new String("National Herald");
		return ref;
	}

	@Bean
	public String paperLanguage() {
		System.out.println("Registered papaer Language using Spring");
		String ref = new String("Kannada");
		return ref;
	}

	@Bean
	public double paperPrice() {
		System.out.println("Registered papaer price using Spring");
		double ref = new Double(4.5);
		return ref;
	}

}
