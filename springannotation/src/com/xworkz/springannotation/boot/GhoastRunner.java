package com.xworkz.springannotation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springannotation.bean.Ghoast;
import com.xworkz.springannotation.configuration.GhoastConfiguration;

public class GhoastRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(GhoastConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Ghoast refOfGhoast = container.getBean(Ghoast.class);
		System.out.println(refOfGhoast);

	}

}
