package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.HashSet;

public class Bike {

	public static void main(String[] args) {
		Collection collection = new HashSet();
		collection.add("Hero");
		collection.add("Honda");
		collection.add("K T M");
		collection.add("T V S");
		collection.add("Harley Davidson");
		collection.add("Royal Enfield");
		collection.add("Bajaj");
		collection.add("Suzuki");
		collection.add("Yamaha");
		collection.add("Aprila");
		collection.add("Ducati");
		collection.add("B M W");
		collection.add("Kawasaki");
		collection.add("Vespa");
		collection.add("Bianchi");
		collection.add("Jawa");
		collection.add("Cannondale");
		collection.add("Specialized");
		collection.add("Gaint");
		collection.add("B M C ");
		collection.add("Marin Bikes");
		collection.add("Santa Cruz Bikes");

		System.out.println(collection);
		System.out.println(collection.size());
		collection.clear();
		System.out.println("After Clearing ArrayList");
		System.out.println(collection.size());
		System.out.println(collection);

	}

}
