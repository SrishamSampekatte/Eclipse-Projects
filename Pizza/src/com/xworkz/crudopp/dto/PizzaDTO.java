package com.xworkz.crudopp.dto;

import java.time.LocalDateTime;

import com.xworkz.crudopp.constant.PizzaSize;

public class PizzaDTO extends AbstaractAuditDTO {
	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private int quantity;
	private String type;

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", quantity=" + quantity + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public PizzaDTO() {
		System.out.println(" Created default constructor of PizzaDTO ");
	}

	public PizzaDTO(String name, String company, PizzaSize size, boolean cheese, double price, int quantity,
			String type, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy,updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
