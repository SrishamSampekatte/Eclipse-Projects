package com.xworkz.encaps.thing;

public class ShopManager {
	
	public String name = "Madhu Loka";
	public Drinks drinks;

	public void useDrinks(Drinks drinks) {

		System.out.println(drinks.getBrand());
		System.out.println(drinks.getSmell());
		System.out.println(drinks.getAmbassador());
		System.out.println(drinks.getPrice());
		System.out.println(drinks.getAmbassador());
		System.out.println(drinks.getColor());
		System.out.println(drinks.getSmellGood());
		System.out.println(drinks.getShape());
		System.out.println(drinks.getQuantity());
		System.out.println(drinks.getFlavor());
		System.out.println(drinks.getGas());
		System.out.println(drinks.getOrigin());

		drinks.setBrand("Bacardy Black ", "Nice ", 650, "Srisham", "Black", true, "Cylinder", 750, "Whisky", false, "India");

	}

}
