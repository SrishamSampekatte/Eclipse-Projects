package com.xworkz.crudop.dto;


public class RailwayStationDTO extends AbstractAuditDTO {
	private String name;
	private int noOfPlatforms;
	private double area;
	private double platformTicketPrice;

	public RailwayStationDTO() {
		System.out.println("Running default constructor of RailwayStation");

	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayStationDTO(String name, int noOfPlatforms, double area, double platformTicketPrice, String createdBy,
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}
	

}
