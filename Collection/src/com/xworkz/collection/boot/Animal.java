package com.xworkz.collection.boot;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;



public class Animal {

	public static void main(String[] args) {
		//Collection<String> animal = new ArrayList<String>();
		
		List<String> animal = new ArrayList<String>();

		
		animal.add("sa");;
		
		animal.add("ca");
		animal.add("da");
		
		animal.add(2,"ga");
		

		System.out.println(animal.size());
		System.out.println("Applying for loop");
		for (String element : animal) {
			System.out.println(element);
		}

		System.out.println(" ");
		System.out.println("Apply while loop ");

		Iterator<String> element = animal.iterator();
		while (element.hasNext()) {
			String ref = element.next();
			System.out.println(ref);
		}
		
		
	}

}
