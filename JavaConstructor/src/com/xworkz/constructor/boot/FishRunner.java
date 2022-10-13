package com.xworkz.constructor.boot;

import com.xworkz.constructor.Fish;

public class FishRunner {

	public static void main(String[] args) 
	{
		Fish meenu;
		meenu=new Fish();
		
		System.out.println(meenu.name);
		System.out.println(meenu.type);
		System.out.println(meenu.length);
		System.out.println(meenu.weight);
		System.out.println(meenu.price);
		
		meenu.name="Goldiee";
		meenu.type="Shine";
		meenu.length=12;
		meenu.weight=12;
		meenu.price=503;
		
		System.out.println(meenu.name);
		System.out.println(meenu.type);
		System.out.println(meenu.length);
		System.out.println(meenu.weight);
		System.out.println(meenu.price);
		
		
		meenu=new Fish("Goldie", "shine" );
		meenu.price=587;
		System.out.println(meenu.name);
		System.out.println(meenu.price);
		System.out.println(meenu.type);
		
		meenu.length=504;
		System.out.println(meenu.length);
		
		
		meenu=new Fish(15,45);
		System.out.println(meenu.weight);
		System.out.println(meenu.price);
		
		
		meenu=new Fish("Goldie","Aqua",12,18,503);
		
		System.out.println("The name is"+ meenu.name);
		System.out.println("The type is "+meenu.type);
		System.out.println("The length of fish is "+ meenu.length);
		System.out.println("The weight of fish is "+ meenu.weight);
		System.out.println("The cost of fish is "+meenu.price);
		
		
	}

}
