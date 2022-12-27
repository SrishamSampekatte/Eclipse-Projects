package com.xworkz.crudhandling.dto;

public class SanitzerDTO extends AbstaractAuditDTO {

	public Integer id;
	public String brand;
	public Double price;
	public String color;

	public SanitzerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitzerDTO(Integer id, String brand, Double price, String color, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitzerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
