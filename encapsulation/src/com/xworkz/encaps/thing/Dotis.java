package com.xworkz.encaps.thing;

public class Dotis {
	private String brand = "Default name";
	private String color = "Default color";
	private String fragrance = "Default fragrance";
	private double price = 00000;
	private String ambassador = "Default ambassodaor";
	private boolean smellGood = true;
	private double size =0;
	private double quantity = 0;
	private String flavor = "Default flavor";
	public boolean gas;
	public String origin;

	public String getBrand() {
		return this.brand;
	}

	public String getColor() {
		return this.color;
	}

	public String getFragrance() {
		return this.fragrance;
	}

	public double getPrice() {
		return this.price;
	}

	public String getAmbassador() {
		return this.ambassador;
	}

	public boolean getSmellGood() {
		return this.smellGood;
	}

	public double getSize() {
		return this.size;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public String getFlavor() {
		return this.flavor;

	}

	public boolean getGas() {
		return this.gas;
	}

	public String getOrigin() {
		return this.origin;

	}

	public void setBrand(String brand,String color, String fragrance, double price, String ambassador, 
			boolean smellGood, double size, double quantity, String flavor, boolean gas, String origin) {

		this.brand = brand;
		this.color = color;
		this.fragrance = fragrance;
		this.price = price;
		this.ambassador = ambassador;
		this.smellGood = smellGood;
		this.size = size;
		this.quantity = quantity;
		this.flavor = flavor;
		this.gas = gas;
		this.origin = origin;
	}

}
