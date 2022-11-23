package com.xworkz.equal.thing;

public class Paint {
	private String brand;
	private String name;
	private String ambassidor;
	private String paintColor;
	private String manfIn;
	private double quantity;
	private double price;
	private double density;
	private String form;
	private boolean quality;

	public Paint() {
		System.out.println("Printing Default Constructor paint...");
	}

	public Paint(String brand, String name, String ambassidor, String paintColor, String manfIn, double quantity,
			double price, double density, String form, boolean quality) {
		super();
		this.brand = brand;
		this.name = name;
		this.ambassidor = ambassidor;
		this.paintColor = paintColor;
		this.manfIn = manfIn;
		this.quantity = quantity;
		this.price = price;
		this.density = density;
		this.form = form;
		this.quality = quality;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Paint) {// checking for instance of
			System.out.println("Obj is the instance of the paint ");
			Paint paint = (Paint) obj;// casting
			if (this.brand.equals(paint.brand)) {
				System.out.println(" The brand is true");
				return true;
			} else {
				System.err.println("The brand is not same");
				return false;
			}

		} else {
			System.err.println("obj is not a instance of paint");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", name=" + name + ", ambassidor=" + ambassidor + ", paintColor=" + paintColor
				+ ", manfIn=" + manfIn + ", quantity=" + quantity + ", price=" + price + ", density=" + density
				+ ", form=" + form + ", quality=" + quality + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmbassidor() {
		return ambassidor;
	}

	public void setAmbassidor(String ambassidor) {
		this.ambassidor = ambassidor;
	}

	public String getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}

	public String getManfIn() {
		return manfIn;
	}

	public void setManfIn(String manfIn) {
		this.manfIn = manfIn;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

}
