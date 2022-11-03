package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Plastic;
import com.xworkz.encaps.thing.PlasticAlter;

public class PlasticRunner {
	public static void main(String[] args) {
		Plastic plastic = new Plastic();
		System.out.println(plastic.getName());
		System.out.println(plastic.getBrandName());
		System.out.println(plastic.getUsedfor());
		System.out.println(plastic.getPrice());
		System.out.println(plastic.getLength());
		System.out.println(plastic.getWeigthingrams());
		System.out.println(plastic.getColour());
		System.out.println(plastic.getHydrobromide());
		System.out.println(plastic.getHydrochloride());
		System.out.println("============================");
		PlasticAlter plasticAlter = new PlasticAlter();
		plasticAlter.plasticAlter(plastic);

	}
}
