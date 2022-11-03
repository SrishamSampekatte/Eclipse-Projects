package com.xworkz.encaps.thing;

public class HouseOwner {
	public String name = "Pareshan";
	public House house;

	public void useHouse(House house) {

		System.out.println(house.getBrand());
		System.out.println(house.getHomeName());
		System.out.println(house.getAmbassador());
		System.out.println(house.getPrice());
		System.out.println(house.getAmbassador());
		System.out.println(house.getColor());
		System.out.println(house.getVillage());
		System.out.println(house.getLocation());
		System.out.println(house.getNoOfMembers());
		System.out.println(house.getFlavor());
		System.out.println(house.getGasConnection());
		System.out.println(house.getOrigin());

		house.setBrand("Prestegious", "Nilaya", 250000, "Srisham", "White", true, "Location",4, "Sandal", true, "India");

	}

}
