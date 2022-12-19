package com.xworkz.crudhandling.dto;

public class BakeryDTO extends AbstaractAuditDTO {
	private String name;
	private String area;
	private String special;
	private double price;

	public BakeryDTO() {
		System.out.println("Created default constructor of Bakery DTO");
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", area=" + area + ", special=" + special + ", price=" + price
				+ ", toString()=" + super.toString() + "]";
	}

	public BakeryDTO(String name, String area, String special, double price, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.area = area;
		this.special = special;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
