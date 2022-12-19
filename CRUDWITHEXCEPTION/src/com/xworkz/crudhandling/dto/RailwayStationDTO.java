package com.xworkz.crudhandling.dto;

public class RailwayStationDTO extends AbstaractAuditDTO {

	private String name;
	private int noOfPlatforms;
	private String area;
	private double platformTicketPrice;

	public RailwayStationDTO() {
		System.out.println("Created default constructor of RailwayStationDTO");
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayStationDTO(String name, int noOfPlatforms, String area, double platformTicketPrice, String createdBy,
			String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
