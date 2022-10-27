package com.xworkz.constants.things;

import com.xworkz.constants.Location;

public class Brand {
	public String name;
	public String gstNo;
	public String rating;
	public Location location;
	
	public Brand(String name, String gstNo, String rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	
	public void showOff() {
		
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.rating);
		System.out.println(Location.MALLESHWARAM);
	}
	
	
	
	

}
