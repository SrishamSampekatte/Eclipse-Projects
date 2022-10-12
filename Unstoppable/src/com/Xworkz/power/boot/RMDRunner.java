package com.Xworkz.power.boot;

import com.Xworkz.power.RMD;

public class RMDRunner {

	public static void main(String[] args) 
	{
		RMD gutka=new RMD();
		System.out.println(gutka.name);
		System.out.println(gutka.fullForm);
		System.out.println(gutka.ingredients);
		System.out.println(gutka.type);
		System.out.println(gutka.main);
		System.out.println(gutka.mfg);
		System.out.println(gutka.beforeChew);
		System.out.println(gutka.afterChew);
		
		
		gutka.weight=10;
		System.out.println(gutka.weight);
		gutka.expiry=3;
		System.out.println(gutka.expiry);
		gutka.packetColor="white";
		System.out.println(gutka.packetColor);
		gutka.packets=2;
		System.out.println(gutka.packets);
		gutka.caution=true;
		System.out.println(gutka.caution);
		gutka.cancer=true;
		System.out.println(gutka.cancer);
		gutka.taste="Wyaak";
		System.out.println(gutka.taste);
		gutka.price=15;
		System.out.println(gutka.price);
		

	}

}
