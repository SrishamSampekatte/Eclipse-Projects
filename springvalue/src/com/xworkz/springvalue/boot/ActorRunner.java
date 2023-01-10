package com.xworkz.springvalue.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springvalue.configuration.ActorConfiguration;
import com.xworkz.springvalue.thing.Actor;
import com.xworkz.springvalue.thing.Rocket;

public class ActorRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		

	}

}
