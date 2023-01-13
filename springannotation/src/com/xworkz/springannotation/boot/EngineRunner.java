package com.xworkz.springannotation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springannotation.bean.Engine;
import com.xworkz.springannotation.configuration.EngineConfiguration;

public class EngineRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);

	}

}
