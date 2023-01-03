package com.xworkz.streams.dto;

import java.io.Serializable;

public class DataBaseVendorDTO implements Serializable {
	private String name;
	private String developedBy;
	private Type type;
	private double size;
	private double licenceCost;

	public DataBaseVendorDTO() {
		System.out.println("Created default constructor");
	}

	public DataBaseVendorDTO(String name, String developedBy, Type type, double size, double licenceCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenceCost = licenceCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenceCost="
				+ licenceCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenceCost() {
		return licenceCost;
	}

	public void setLicenceCost(double licenceCost) {
		this.licenceCost = licenceCost;
	}

}
