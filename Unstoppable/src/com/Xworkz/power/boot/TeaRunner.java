package com.Xworkz.power.boot;

import com.Xworkz.power.Tea;

public class TeaRunner {

	public static void main(String[] args)
	{
		Tea chai=new Tea();
		System.out.println(chai.name);
		System.out.println(chai.ingreadientOne);
		System.out.println(chai.ingreadientTwo);
		System.out.println(chai.boil);
		System.out.println(chai.type);
		System.out.println(chai.powderSize);
		System.out.println(chai.powderColor);
		System.out.println(chai.famous);
		
		chai.favt="Yes";
		System.out.println("Tea is My favt " +chai.favt);
		
		chai.noTea="Head Ache";
		System.out.println(chai.noTea);
		
		chai.healthyTea="Green Tea";
		System.out.println(chai.healthyTea);
		
		chai.sugar="Medium";
		System.out.println(chai.sugar);
		
		chai.moreTea="No Sleep";
		System.out.println(chai.moreTea);
		
		chai.bestCombo="Cigerate";
		System.out.println(chai.bestCombo);
		
		chai.price=10;
		System.out.println(chai.price);
		

	}

}
