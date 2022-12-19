package com.xworkz.crudhandling.dto;

public class BuildingDTO extends AbstaractAuditDTO {

	private String no;
	private int floor;
	private boolean lift;
	private boolean parking;
	private String type;

	public BuildingDTO() {
		System.out.println("Default constructor");
	}

	public BuildingDTO(String no, int floor, boolean lift, boolean parking, String type, String createdBy,
			String updatedBy) {
		super(createdBy, updatedBy);
		this.no = no;
		this.floor = floor;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", floor=" + floor + ", lift=" + lift + ", parking=" + parking + ", type="
				+ type + ", toString()=" + super.toString() + "]";
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
