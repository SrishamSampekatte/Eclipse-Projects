package com.xworkz.constants.things;

import com.xworkz.constants.Temple;
import com.xworkz.constants.things.association.Location;

public class Mountain {
	
	public String name;
	public double height;
	public Temple temple=Temple.SARVAJNAPEETA;
	public Location location;
	
	
	
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println(this.temple);

		
		Location location=new Location("Sampekatte","Shimoga","Karnataka", 577452,"India");
		location.showOff();
	}

}