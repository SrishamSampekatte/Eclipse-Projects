package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.BatteAngadi;
import com.xworkz.encaps.thing.Dotis;


public class DotisRunner {

	public static void main(String[] args) {
		BatteAngadi angadi = new BatteAngadi();
		Dotis dotis = new Dotis();

		angadi.useDotis(dotis);
		System.out.println("");
		System.out.println("after modifying : The default variables");
		angadi.useDotis(dotis);

		System.out.println("");
		System.out.println("Giving access only to read ");

		System.out.println("Store manager name is " + angadi.name);
		System.out.println(dotis.getBrand());
		System.out.println(dotis.getFragrance());
		System.out.println(dotis.getPrice());
		System.out.println(dotis.getAmbassador());
		System.out.println(dotis.getColor());
		System.out.println(dotis.getSmellGood());
		System.out.println(dotis.getSize());
		System.out.println(dotis.getQuantity());
		System.out.println(dotis.getFlavor());
		System.out.println(dotis.getGas());
		System.out.println(dotis.getOrigin());

	}


	

}
