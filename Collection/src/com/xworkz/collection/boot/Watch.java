package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();

		collection.add("Fossil");
		collection.add("Rado");
		collection.add("Police");
		collection.add("Apple");
		collection.add("Rolex");

		System.out.println(collection);
		System.out.println(collection.size());
		
		System.out.println(" *************************** ");
		System.out.println("Applying for loop");
		for(String element:collection) {
			System.out.println(element);
		}
		
		System.out.println(" ");
		System.out.println("Applying iterartor");
		
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String watches=itr.next();
			System.out.println(watches);
		}
	}

}
