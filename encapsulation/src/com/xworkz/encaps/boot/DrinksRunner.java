package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Drinks;
import com.xworkz.encaps.thing.ShopManager;


public class DrinksRunner {

	public static void main(String[] args) {
		ShopManager manager = new ShopManager();
		Drinks drinks = new Drinks();

		manager.useDrinks(drinks);
		System.out.println("");
		System.out.println("after modifying : The default variables");
		manager.useDrinks(drinks);

		System.out.println("");
		System.out.println("Giving access only to read ");

		System.out.println("Store manager name is " + manager.name);
		System.out.println(drinks.getBrand());
		System.out.println(drinks.getColor());
		System.out.println(drinks.getPrice());
		System.out.println(drinks.getAmbassador());
		System.out.println(drinks.getColor());
		System.out.println(drinks.getSmellGood());
		System.out.println(drinks.getShape());
		System.out.println(drinks.getQuantity());
		System.out.println(drinks.getFlavor());
		System.out.println(drinks.getGas());
		System.out.println(drinks.getOrigin());

	}

	}


