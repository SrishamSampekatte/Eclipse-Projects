package com.xworkz.streams.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private WeaponType type;

	public WeaponDTO() {
		System.out.println("Created default constructor");
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO ref = (WeaponDTO) obj;
				if (this.name.equalsIgnoreCase(ref.name) && this.type.equals(ref.type)) {
					System.out.println("The weaponsa are same " + ref);
				}

			}
		}
		return false;
	}

	// public int compareTo() {
	// return 0;

//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
