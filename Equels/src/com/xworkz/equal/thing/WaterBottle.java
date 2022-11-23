package com.xworkz.equal.thing;

public class WaterBottle {
	private String brand;
	private double price;
	private String colour;
	private String type;
	private int quantity;
	private boolean quality;
	private String owner;
	private String size;
	private boolean hotResistance;
	private boolean coldResistance;

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type
				+ ", quantity=" + quantity + ", quality=" + quality + ", owner=" + owner + ", size=" + size
				+ ", hotResistance=" + hotResistance + ", coldResistance=" + coldResistance + "]";
	}

	@Override
	public boolean equals(Object other) {
	System.out.println("running equals method in Water bottle");



	if(other instanceof WaterBottle) {
		System.out.println("other is Water bottle, can check the properties");


		WaterBottle castedRef = (WaterBottle)other;
		if(this.colour.equals(castedRef.colour) && this.brand.equals(castedRef.brand) && this.type.equals(castedRef.type)) {
			System.out.println("same");
			return true;
		}

	}else {
		System.err.println("other is not Water bottle, can not chech th properties");
	}

		return false;
	}

	public WaterBottle(String brand, double price, String colour, String type, int quantity, boolean quality,
			String owner, String size, boolean hotResistance, boolean coldResistance) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.owner = owner;
		this.size = size;
		this.hotResistance = hotResistance;
		this.coldResistance = coldResistance;
	}

}
