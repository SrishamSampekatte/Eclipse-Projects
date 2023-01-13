package com.xworkz.springannotation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springannotation.bean.NewsPaper;
import com.xworkz.springannotation.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		NewsPaper refOfPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfPaper);

	}

}
