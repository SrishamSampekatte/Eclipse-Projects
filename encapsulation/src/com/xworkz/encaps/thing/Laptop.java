package com.xworkz.encaps.thing;

public class Laptop {
	private String brand;
	private String modelName;
	private String processorBrand;
	String processorName;
	private String graphicProcessor;
	private double launchYear;
	private double capacityOfSSD;
	private double price;
	private int ram ;
	private int batteryBackUp;
	private int warranty;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setProcessorBrand(String processorBrand) {
		this.processorBrand = processorBrand;
	}

	void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	void setGraphicProcessor(String graphicProcessor) {
		this.graphicProcessor = graphicProcessor;
	}

	void setLaunchYear(double launchYear) {
		this.launchYear = launchYear;
	}

	void setCapacityOfSSD(double capacityOfSSD) {
		this.capacityOfSSD = capacityOfSSD;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setRam(int ram) {
		this.ram = ram;
	}

	void setBatteryBackUp(int batteryBackUp) {
		this.batteryBackUp = batteryBackUp;
	}

	void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public String getModelName() {
		return modelName;
	}

	public String getProcessorBrand() {
		return processorBrand;
	}

	public String getProcessorName() {
		return processorName;
	}

	public String getGraphicProcessor() {
		return graphicProcessor;
	}

	public double getLaunchYear() {
		return launchYear;
	}

	public double getCapacityOfSSD() {
		return capacityOfSSD;
	}

	public double getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getBatteryBackUp() {
		return batteryBackUp;
	}

	public int getWarranty() {
		return warranty;
	}

}
