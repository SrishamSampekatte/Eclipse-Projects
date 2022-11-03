package com.xworkz.encaps.thing;

public class HimalyanAlter {

	public void modifyingHimalaya(Himalayan himalaya) {
		himalaya.setProductName("Mama_Earth");
		System.out.println(himalaya.getProductName());
		himalaya.setManufacturingBy("MamaEarth");
		System.out.println(himalaya.getManufacturingBy());
		himalaya.setModelName("Vitamin C Face Wash with Vitamin C and Turmeric for Skin Illumination - 100ml ");
		System.out.println(himalaya.getModelName());
		himalaya.setQuantity(100);
		System.out.println(himalaya.getQuantity());
		himalaya.setPrice(250);
		System.out.println(himalaya.getPrice());
		himalaya.setFaceWashType("Cream");
		System.out.println(himalaya.getFaceWashType());
		himalaya.setIngredientType("Organic");
		System.out.println(himalaya.getIngredientType());
		himalaya.setMaximumShelfLife(24);
		System.out.println(himalaya.getMaximumShelfLife());
		himalaya.setAppliedFor("Anti-dullness, Deep Cleansing, Anti-ageing, Tan Removal");
		System.out.println(himalaya.getAppliedFor());
		himalaya.setSkinType("All Skin Types");
		System.out.println(himalaya.getSkinType());
		himalaya.setContainerType("Bottele");
		System.out.println(himalaya.getContainerType());
	}

}
