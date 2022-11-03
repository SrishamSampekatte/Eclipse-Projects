package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Perfume;
import com.xworkz.encaps.thing.StoreManager;

public class PerfumeRunner {

	public static void main(String[] args) {
		StoreManager manager = new StoreManager();
		Perfume perfume = new Perfume();

		manager.usePerfume(perfume);
		System.out.println("");
		System.out.println("after modifying : The default variables");
		manager.usePerfume(perfume);

		System.out.println("");
		System.out.println("Giving access only to read ");

		System.out.println("Store manager name is " + manager.name);
		System.out.println(perfume.getBrand());
		System.out.println(perfume.getFragrance());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.getAmbassador());
		System.out.println(perfume.getColor());
		System.out.println(perfume.getSmellGood());
		System.out.println(perfume.getShape());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.getFlavor());
		System.out.println(perfume.getGas());
		System.out.println(perfume.getOrigin());

	}

}
