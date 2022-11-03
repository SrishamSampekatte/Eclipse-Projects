package com.xworkz.encaps.thing;

public class StoreManager {
	public String name = "Rahul";
	public Perfume perfume;

	public void usePerfume(Perfume perfume) {

		System.out.println(perfume.getBrand());
		System.out.println(perfume.getFragrance());
		System.out.println(perfume.getAmbassador());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.getAmbassador());
		System.out.println(perfume.getColor());
		System.out.println(perfume.getSmellGood());
		System.out.println(perfume.getShape());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.getFlavor());
		System.out.println(perfume.getGas());
		System.out.println(perfume.getOrigin());

		perfume.setBrand("Skin", "Classic", 2500, "Atri", "White", true, "Cylinder", 250, "Sandal", false, "India");

	}
}