package com.Xworkz.power.boot;

import com.Xworkz.power.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) 
	{
	 Dustbin kasa=new Dustbin();
	 System.out.println(kasa.name);
	 System.out.println(kasa.use);
	 System.out.println(kasa.made);
	 System.out.println(kasa.type);
	 System.out.println(kasa.color1);
	 System.out.println(kasa.color2);
	 System.out.println(kasa.size);
	 System.out.println(kasa.useful);
	 
	 kasa.weight=500;
	 System.out.println(kasa.weight);
	 kasa.expiry=2;
	 System.out.println(kasa.expiry);
	 kasa.tag="use me";
	 System.out.println(kasa.tag);
	 kasa.plastic="dustbin";
	 System.out.println(kasa.plastic);
	 kasa.reuse=true;
	 System.out.println(kasa.reuse);
	 kasa.radius=15.6;
	 System.out.println(kasa.radius);
	 kasa.price=68;
	 System.out.println(kasa.price);
	 

	}

}
