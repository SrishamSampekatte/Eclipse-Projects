package com.xworkz.associationspring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.associationspring.configuration.MovieConfiguration;
import com.xworkz.associationspring.thing.CameraMan;
import com.xworkz.associationspring.thing.Company;
import com.xworkz.associationspring.thing.Lens;
import com.xworkz.associationspring.thing.Location;
import com.xworkz.associationspring.thing.Movie;
import com.xworkz.associationspring.thing.Producer;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Movie lens = container.getBean(Movie.class);
		System.out.println(lens);

	}

}
