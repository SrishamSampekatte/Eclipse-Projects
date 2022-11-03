package com.xworkz.encaps.thing;

public class Perfume {
	private String brand = "Default name";
	private String fragrance = "Default fragrance";
	private double price = 00000;
	private String ambassador = "Default ambassodaor";
	private String color = "Default color";
	private boolean smellGood = true;
	private String shape = "Default shape";
	private double quantity = 0;
	private String flavor = "Default flavor";
	public boolean gas;
	public String origin;

	public Perfume() {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return this.brand;
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

	public String getColor() {
		return this.color;
	}

	public boolean getSmellGood() {
		return this.smellGood;
	}

	public String getShape() {
		return this.shape;
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

	public void setBrand(String brand, String fragrance, double price, String ambassador, String color,
			boolean smellGood, String shape, double quantity, String flavor, boolean gas, String origin) {

		this.brand = brand;
		this.fragrance = fragrance;
		this.price = price;
		this.ambassador = ambassador;
		this.color = color;
		this.smellGood = smellGood;
		this.shape = shape;
		this.quantity = quantity;
		this.flavor = flavor;
		this.gas = gas;
		this.origin = origin;
	}

}
