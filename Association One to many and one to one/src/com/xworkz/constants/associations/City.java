package com.xworkz.constants.associations;

public class City {
	
	public String nameIs;
	public double areaInSqKm;
	public boolean capital;
	
	
	public City(String nameIs) {
		super();
		this.nameIs= nameIs;
	}
	
	public City(Name name1) {
	
	}

	public void setAreaInSqKm(double areaInSqKm ) {
		this.areaInSqKm=areaInSqKm;
		
	}
	
	public void setCapital(boolean capital) {
		this.capital=capital;
	}
	
	public void showOff() {
		System.out.println(this.areaInSqKm);
		System.out.println(this.capital);
		if (this.nameIs!=null) {
			System.out.println(this.nameIs);
		}
		else {
			System.out.println("City name is null ");
		}
		
		
		}
	}
	
	


