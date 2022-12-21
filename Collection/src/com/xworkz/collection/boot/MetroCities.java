package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCities {

	public static void main(String[] args) {
		Collection<String> metroCiti = new ArrayList<String>();
		metroCiti.add("Banglore");
		metroCiti.add("Delhi");
		metroCiti.add("Mumbai");
		metroCiti.add("Kolkatta");
		metroCiti.add("Chennai");
		System.out.println(metroCiti.size());

		System.out.println("Using for loop ");

		for (String element : metroCiti) {
			System.out.println(element);
		}

		System.out.println(" -------------------- ");

		Iterator<String> element = metroCiti.iterator();
		while (element.hasNext()) {
			String reference = element.next();
			System.out.println(reference);
		}

	}

}
