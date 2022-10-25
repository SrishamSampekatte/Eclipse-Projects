package com.xworkz.constants.things.boot;

import com.xworkz.constants.Variety;
import com.xworkz.constants.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
			Flower flower =new Flower("Red");
			flower.setPrice(45);
			flower.qunatity=45;
			flower.type=Variety.CHEND_HUVA;
			flower.dispaly();
			flower.totalPrice();

	}

}
