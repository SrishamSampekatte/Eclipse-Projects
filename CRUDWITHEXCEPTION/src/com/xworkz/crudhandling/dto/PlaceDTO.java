package com.xworkz.crudhandling.dto;

public class PlaceDTO extends AbstaractAuditDTO {
	private String name;
	private String famousFor;
	private double entryFee;
	private String nearBy;
	private String state;

	public PlaceDTO() {
		System.out.println("Created default constuctor");
	}

	public PlaceDTO(String name, String famousFor, double entryFee, String nearBy, String state, String createdBy,
			String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.famousFor = famousFor;
		this.entryFee = entryFee;
		this.nearBy = nearBy;
		this.state = state;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", entryFee=" + entryFee + ", nearBy=" + nearBy
				+ ", state=" + state + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public String getNearBy() {
		return nearBy;
	}

	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
