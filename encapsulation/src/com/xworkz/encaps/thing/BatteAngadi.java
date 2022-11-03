package com.xworkz.encaps.thing;

public class BatteAngadi {
	
	public String name = "Rahul";
	public Dotis dotis;

	public void useDotis(Dotis dotis) {

		System.out.println(dotis.getBrand());
		System.out.println(dotis.getColor());
		System.out.println(dotis.getFragrance());
		System.out.println(dotis.getAmbassador());
		System.out.println(dotis.getPrice());
		System.out.println(dotis.getAmbassador());
		System.out.println(dotis.getSmellGood());
		System.out.println(dotis.getSize());
		System.out.println(dotis.getQuantity());
		System.out.println(dotis.getFlavor());
		System.out.println(dotis.getGas());
		System.out.println(dotis.getOrigin());

		dotis.setBrand("Ram Raj","White","mild", 2500, "Yash", true, 3,3, "Nice", false, "India");

	}

}
