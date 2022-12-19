package com.xworkz.crudopp.dto;

public class RailwayStationDTO extends AbstaractAuditDTO {

	private String name;
	private int noOfPlatforms;
	private double area;
	private double platformTicketPrice;

	public RailwayStationDTO() {
		System.out.println("Created default constructor");
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayStationDTO(String name, int noOfPlatforms, double area, double platformTicketPrice, String createdBy,
			String updatedBy) {
		super(createdBy,updatedBy);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

}