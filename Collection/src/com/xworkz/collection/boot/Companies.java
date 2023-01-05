package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Companies {

	public static void main(String[] args) {
		List<String> companies = new ArrayList<String>();
		companies.add("Micro Soft");
		companies.add("Google");
		companies.add("Infosys");
		companies.add("Oracle");
		companies.add("J P Morgan");
		companies.add("Accuvate");
		companies.add("Morgan Stanley");
		companies.add("T C S ");
		companies.add("H C L");
		companies.add("B A R C");
		companies.add("I T C");
		companies.add("Canara Bank");
		companies.add(" Bosch");
		companies.add("Amzon");
		companies.add("K P IT");
		companies.add("Birla Soft");
		companies.add("Persistant");
		companies.add("Lowe");
		companies.add("L and T ");
		companies.add("Wipro");
		
		companies.listIterator();

		System.out.println(companies.size());

		for (String element : companies) {
			System.out.println(element);
		}

		System.out.println(" ------------------------ ");

		System.out.println("Running iterator");

		ListIterator<String> element = companies.listIterator();
	
		while(element.hasPrevious()) {
			String elementt=element.previous();
			System.out.println(elementt);
		}
		

	}

}
