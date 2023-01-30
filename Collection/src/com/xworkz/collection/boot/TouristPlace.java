package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TouristPlace {
	public static void main(String[] args) {

		List<String> tourist = new ArrayList<String>();
		tourist.add("one");
		tourist.add("two ");
		tourist.add("two ");
		tourist.add("Srisham");

		System.out.println(tourist.size());
		System.out.println(tourist.isEmpty());

		// System.out.println(tourist.contains("a"));
		for (String string : tourist) {
		//	System.out.println(string);
		}

		Iterator<String> it = tourist.iterator();
		while (it.hasNext()) {
			String ref = it.next();
			//System.out.println(ref);
		}

		// System.out.println(tourist.toString());

		tourist.stream().collect(Collectors.toSet()).
			forEach(e->{System.out.println(e);});
		
	}
}
