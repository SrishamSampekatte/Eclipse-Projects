package com.xworkz.encaps.thing;

public class BikeAlter {
	public void alter(Bike bike) {
		bike.setBikeBrand("BULLET");
		bike.setBore(82);
		bike.setWheelsType("Alloy");
		bike.setModelName(2021);
		bike.setEngineType("Single Cylinder, 4 Valve, Liquid Cooled, FI");
		bike.setWheelSizerear(425.5);
		bike.setWheelSizeback(425.5);
		bike.setEngineDisplacement(215.5);
		bike.setMaxTorque(12000);
		bike.setStroke(51.2);
		bike.setSpeedometer("Digital idey");
		
		System.out.println(bike.getBikeBrand());
		System.out.println(bike.getBore());
		System.out.println(bike.getWheelSizeback());
		System.out.println(bike.getWheelSizerear());
		System.out.println(bike.getWheelsType());
		System.out.println(bike.getEngineDisplacement());
		System.out.println(bike.getEngineType());
		System.out.println(bike.getMaxTorque());
		System.out.println(bike.getSpeedometer());
		System.out.println(bike.getStroke());
		System.out.println(bike.getModelName());
		
		
	}

}
