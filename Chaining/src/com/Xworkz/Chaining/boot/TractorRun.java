package com.Xworkz.Chaining.boot;

import com.Xworkz.Chaining.Tractor;

	public class TractorRun {

	public static void main(String[] args)
	{
		Tractor tractor=new Tractor();
		System.out.println("TRACTORRRRR");
		
		Tractor tractorr=new Tractor("Girimaji");
		System.out.println(tractorr.name);
		
		Tractor tractor1=new Tractor("Girimaji",15);
		System.out.println(tractor1.name);
		System.out.println(tractor1.hp);
		
		Tractor tractor2=new Tractor("Girimaji",15,98000);
		System.out.println(tractor2.name);
		System.out.println(tractor2.hp);
		System.out.println(tractor2.price);
		
		Tractor tractor3=new Tractor("Girimaji",15,98000);
		System.out.println(tractor3.name);
		System.out.println(tractor3.hp);
		System.out.println(tractor3.price);
		
		Tractor tractor4=new Tractor("Girimaji",15,98000,"Blue");
		System.out.println(tractor4.name);
		System.out.println(tractor4.hp);
		System.out.println(tractor4.price);
		System.out.println(tractor4.color);
		
		Tractor tractor5=new Tractor("Girimaji",15,98000,"Blue");
		System.out.println(tractor5.name);
		System.out.println(tractor5.hp);
		System.out.println(tractor5.price);
		System.out.println(tractor5.color);
		System.out.println(tractor5.model);
		
		
		
	}

}
