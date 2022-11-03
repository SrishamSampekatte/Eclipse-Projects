package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Bike;
import com.xworkz.encaps.thing.BikeAlter;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike = new Bike();

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
		System.out.println("=======================================");

		BikeAlter bikeAlter = new BikeAlter();
		bikeAlter.alter(bike);
		System.out.println(bike);

	}

}
