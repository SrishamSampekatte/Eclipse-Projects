package com.xworkz.constructor.boot;

import com.xworkz.constructor.Boat;

public class BoatRunner {

	public static void main(String[] args)
	{
		Boat boat;
		boat=new Boat();
		
		boat.companyName="Boat";
		boat.name="Srisham";
		boat.type="In ear";
		boat.color="Black";
		boat.owner="Boat Owner";
		System.out.println(boat.companyName);
		System.out.println(boat.name);
		System.out.println(boat.type);
		System.out.println(boat.color);
		System.out.println(boat.owner);
		System.out.println("===================================");
		
		boat=new Boat("Boattt","Srishamm","In yearrr","Blackkkk","Boat ownerrrr");
		System.out.println(boat.companyName);
		System.out.println(boat.name);
		System.out.println(boat.type);
		System.out.println(boat.color);
		System.out.println(boat.owner);
		
		

	}
	

}
