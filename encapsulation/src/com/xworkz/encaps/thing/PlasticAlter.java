package com.xworkz.encaps.thing;

public class PlasticAlter {
	public void plasticAlter(Plastic plastic) {
		plastic.setName("Ibbani");
		plastic.setBrandName("Ibbani Home Product");
		plastic.setQuality(true);
		plastic.setUsedfor("drinking");
		plastic.setPrice(20);
		plastic.setLength(8);
		plastic.setWidth(20);
		plastic.setWeigthingrams(2);
		plastic.setColour("Color");
		plastic.setHydrobromide(01);
		plastic.setHydrochloride(5);
		
		System.out.println(plastic.getName());
		System.out.println(plastic.getBrandName());
		System.out.println(plastic.getUsedfor());
		System.out.println(plastic.getPrice());
		System.out.println(plastic.getLength());
		System.out.println(plastic.getWeigthingrams());
		System.out.println(plastic.getColour());
		System.out.println(plastic.getHydrobromide());
		System.out.println(plastic.getHydrochloride());
		
	}

}
