package com.xworkz.equal.boot;
import com.xworkz.equal.thing.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle waterBottle = new WaterBottle("Decothalon", 12345.6, "Black", "Plastic", 1, true, "ANUSHA",
				"KA16 3454", true, true);
		System.out.println(waterBottle);

		WaterBottle waterBottle2 = new WaterBottle("TVS", 123456, "WHITE", "BIKE", 1, true, "ANUSHA", "KA14 3454", true,
				true);
		System.out.println(waterBottle2);

		boolean same3 = waterBottle.equals(waterBottle2);
		System.out.println(same3);

	}

}
