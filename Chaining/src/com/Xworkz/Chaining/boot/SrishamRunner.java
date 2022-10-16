package com.Xworkz.Chaining.boot;

import com.Xworkz.Chaining.Srisham;

public class SrishamRunner {

	public static void main(String[] args)
	{
		Srisham srisham=new Srisham();
		System.out.println(srisham.name);
		srisham.name="Srisham";
		System.out.println("My name is "+ srisham.name);
		
		
		Srisham sri=new Srisham(10,"abcx");
		System.out.println(sri.age);
		System.out.println(sri.name);
		
		Srisham sham=new Srisham(01,"Srisham","Sampekatte");
		System.out.println(sham.age);
		System.out.println(sham.name);
		System.out.println(sham.area);
		
	}

}
