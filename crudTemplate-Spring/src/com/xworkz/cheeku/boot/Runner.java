package com.xworkz.cheeku.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.cheeku.configuration.SpringConfiguration;
import com.xworkz.cheeku.dto.FirstAidDTO;
import com.xworkz.cheeku.dto.MissileDTO;
import com.xworkz.cheeku.dto.ResortDTO;
import com.xworkz.cheeku.service.FirstAidService;
import com.xworkz.cheeku.service.MissileService;
import com.xworkz.cheeku.service.ResortService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("Saved" + saved);

		MissileService service1 = container.getBean(MissileService.class);
		boolean saved1 = service1.validateAndSave(new MissileDTO());
		System.out.println("Saved" + saved1);

		ResortService service2 = container.getBean(ResortService.class);
		boolean saved2 = service2.validateAndSave(new ResortDTO());
		System.out.println("Saved" + saved2);
	}

}
