package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {

	public static void main(String[] args) {
		Collection<String> collection = new LinkedList<String>();
		collection.add("United States Dollar");
		collection.add("Euro");
		collection.add("Pound sterling");
		collection.add("Indian Rupee");
		collection.add("Australian Dollar");
		collection.add("Canadian Dollar");
		collection.add("Swiss Franc");
		collection.add("Singapore Dollar");
		collection.add("Japaneese Yen");
		collection.add("South African Rand");
		collection.add("Hong Kong Dollar");
		collection.add("Danish Krone");
		collection.add("New Zealand Dollar");
		collection.add("Russian Ruble");
		collection.add("Brazilan Real");
		collection.add("Philippine peso");
		collection.add("Bulgarian Lev");
		collection.add("Mexican Peso");
		collection.add("Turkish Lira");
		collection.add("Swedish Krona");
		collection.add("Czech Koruna");
		collection.add("Romanian Leu");
		collection.add("Malaysian Ringgit");
		collection.add("Insreli Shekel");
		collection.add("Polish Zloty");
		collection.add("Thai Baht");
		
		System.out.println(collection);
		System.out.println("Before clearing arrey list");
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("After clearing arrey list");
		System.out.println(collection.size());
		

	}

}
