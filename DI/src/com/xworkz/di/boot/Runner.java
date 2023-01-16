package com.xworkz.di.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.bridge.Petrolbunk;
import com.xworkz.di.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Petrolbunk refOfPetrol = container.getBean(Petrolbunk.class);
		//System.out.println(refOfPetrol);
		refOfPetrol.purchase();
		
		

	}

}
