package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		Collection<String> animal = new ArrayList<String>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Cow");
		animal.add("Tiger");
		animal.add("Cheeth");
		animal.add("Bull");
		animal.add("Lion");
		animal.add("Tusker");
		animal.add("Wild Boar");
		animal.add("Camel");

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
