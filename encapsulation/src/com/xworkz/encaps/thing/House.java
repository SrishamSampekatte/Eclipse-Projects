package com.xworkz.encaps.thing;

public class House {
	private String brand = "Default name";
	private String homeName = "Default fragrance";
	private double price = 00000;
	private String ambassador = "Default ambassodaor";
	private String color = "Default color";
	private boolean village = true;
	private String location = "Default Location";
	private double noOfMembers = 0;
	private String flavor = "Default flavor";
	public boolean gasConnection;
	public String origin;

	public String getBrand() {
		return this.brand;
	}

	public String getHomeName() {
		return this.homeName;
	}

	public double getPrice() {
		return this.price;
	}

	public String getAmbassador() {
		return this.ambassador;
	}

	public String getColor() {
		return this.color;
	}

	public boolean getVillage() {
		return this.village;
	}

	public String getLocation() {
		return this.location;
	}

	public double getNoOfMembers() {
		return this.noOfMembers;
	}

	public String getFlavor() {
		return this.flavor;

	}

	public boolean getGasConnection() {
		return this.gasConnection;
	}

	public String getOrigin() {
		return this.origin;

	}

	public void setBrand(String brand, String homeName, double price, String ambassador, String color, boolean village,
			String location, double noOfMembers, String flavor, boolean gasConnection, String origin) {
		
		this.brand = brand;
		this.homeName = homeName;
		this.price = price;
		this.ambassador = ambassador;
		this.color = color;
		this.village = village;
		this.location = location;
		this.noOfMembers = noOfMembers;
		this.flavor = flavor;
		this.gasConnection = gasConnection;
		this.origin = origin;
	}

	


}
