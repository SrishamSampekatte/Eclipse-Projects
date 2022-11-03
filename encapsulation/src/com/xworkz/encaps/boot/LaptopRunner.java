package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Laptop;
import com.xworkz.encaps.thing.LaptopAlter;

public class LaptopRunner {

	public static void main(String[] args) {
		
			Laptop laptop=new Laptop();
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getModelName());
			System.out.println(laptop.getProcessorBrand());
			System.out.println(laptop.getProcessorName());
			System.out.println(laptop.getGraphicProcessor());
			System.out.println(laptop.getLaunchYear());
			System.out.println(laptop.getCapacityOfSSD());
			System.out.println(laptop.getPrice());
			System.out.println(laptop.getRam());
			System.out.println(laptop.getBatteryBackUp());
			System.out.println(laptop.getWarranty());
			
			
			System.out.println(" ");
			LaptopAlter laptopAlter = new LaptopAlter();
			laptopAlter.Altering(laptop);
			

	}

}
