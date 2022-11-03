package com.xworkz.encaps.thing;

public class LaptopAlter {
	
	public void Altering(Laptop laptop) {
		laptop.setBrand("HP");
		laptop.setModelName("15s-fr2511TU");
		laptop.setProcessorBrand("Intel");
		laptop.setProcessorName(null);
		laptop.setGraphicProcessor(null);
		laptop.setLaunchYear(2019);
		laptop.setCapacityOfSSD(240);
		laptop.setPrice(560164);
		laptop.setRam(4);
		laptop.setBatteryBackUp(6);
		laptop.setWarranty(1);
		
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getModelName());
		System.out.println(laptop.getProcessorBrand());
		System.out.println(laptop.processorName);
		System.out.println(laptop.getGraphicProcessor());
		System.out.println(laptop.getLaunchYear());
		System.out.println(laptop.getCapacityOfSSD());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getBatteryBackUp());
		System.out.println(laptop.getWarranty());
	}
	

}
