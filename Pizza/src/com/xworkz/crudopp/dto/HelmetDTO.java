package com.xworkz.crudopp.dto;

import java.time.LocalDateTime;

import com.xworkz.crudopp.constant.HelmetColor;
import com.xworkz.crudopp.constant.HelmetType;

public class HelmetDTO extends AbstaractAuditDTO {

	private String company;
	private HelmetType type;
	private double price;
	private HelmetColor color;

	public HelmetDTO() {
		System.out.println("Running default constructor");
	}

	@Override
	public String toString() {
		return "HelmetDTO [company=" + company + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public HelmetDTO(String company, HelmetType type, double price, HelmetColor color, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.company = company;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public HelmetColor getColor() {
		return color;
	}

	public void setColor(HelmetColor color) {
		this.color = color;
	}

}
