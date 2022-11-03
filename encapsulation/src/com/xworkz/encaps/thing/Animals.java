package com.xworkz.encaps.thing;

public class Animals {

		private String breed = "Default breed";
		private String name= "Default name";
		private double price = 00000;
		private String type = "Default type";
		private String color = "Default color";
		private boolean active= true;
		private double size =0.0;
		private double quantity = 0;
		private double age = 0.0;
		public boolean aggressive;
		public String origin;

		public String getBreed() {
			return this.breed;
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
