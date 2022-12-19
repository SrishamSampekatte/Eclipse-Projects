package com.xworkz.crudhandling.dto;

public class TheaterDTO extends AbstaractAuditDTO {

	private String name;
	private int id;
	private String brand;
	private int seats;

	public TheaterDTO() {
		System.out.println("Created default constructor");
	}

	public TheaterDTO(String name, int id, String brand, int seats, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.id = id;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", id=" + id + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	

}
