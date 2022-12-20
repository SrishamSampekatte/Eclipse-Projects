package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList();

		collection.add("Jamoon");
		collection.add("Holige");
		collection.add("Mysore Pak");
		collection.add("7 cup cake");
		collection.add("Kaaju Katli");
		collection.add("Payasa");
		collection.add("Kesari Bath");
		collection.add("Dharwad Peda");
		collection.add("Basan Laadu");
		collection.add("Carrot Halva");
		collection.add("Kadabu");
		collection.add("Mysore Pak");
		collection.add("Kobbari Mitai");

		System.out.println(collection);

		System.out.println("Before clearing array list");
		System.out.println(collection.size());

		System.out.println("After clearing Arry list");
		collection.clear();
		System.out.println(collection.size());

	}

}
