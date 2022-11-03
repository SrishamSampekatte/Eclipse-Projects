package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.House;
import com.xworkz.encaps.thing.HouseOwner;

public class HouseRunner {

	public static void main(String[] args) {
			HouseOwner owner = new HouseOwner();
			House house = new House();

			owner.useHouse(house);
			System.out.println("");
			System.out.println("after modifying : The default variables");
			owner.useHouse(house);

			System.out.println("");
			System.out.println("Giving access only to read ");

			System.out.println("Store manager name is " + owner.name);
			System.out.println(house.getBrand());
			System.out.println(house.getHomeName());
			System.out.println(house.getPrice());
			System.out.println(house.getAmbassador());
			System.out.println(house.getColor());
			System.out.println(house.getVillage());
			System.out.println(house.getLocation());
			System.out.println(house.getNoOfMembers());
			System.out.println(house.getFlavor());
			System.out.println(house.getGasConnection());
			System.out.println(house.getOrigin());

		}
		

	

}
