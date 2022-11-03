package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Himalayan;
import com.xworkz.encaps.thing.HimalyanAlter;

public class HimalayanRunner {

	public static void main(String[] args) {
		Himalayan himalaya = new Himalayan();
		
		
		System.out.println(himalaya.getProductName());
		System.out.println(himalaya.getManufacturingBy());
		System.out.println(himalaya.getModelName());
		System.out.println(himalaya.getQuantity());
		System.out.println(himalaya.getPrice());
		System.out.println(himalaya.getFaceWashType());
		System.out.println(himalaya.getIngredientType());
		System.out.println(himalaya.getMaximumShelfLife());
		System.out.println(himalaya.getAppliedFor());
		System.out.println(himalaya.getSkinType());
		System.out.println(himalaya.getContainerType());
		System.out.println("=======================================");
		
		
		HimalyanAlter himalayaModify = new HimalyanAlter();
		himalayaModify.modifyingHimalaya(himalaya);
		System.out.println(himalaya);

	}

}
