package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.DowryChild;
import com.xworkz.inheherit.thing.Dowry;


public class DowryRunner {

	public static void main(String[] args) {
		Dowry dowry = new Dowry();
		System.out.println(dowry.name);
		System.out.println(dowry.varaDakshine);
		System.out.println(dowry.leagal);
		
		System.out.println(" ");
		
		DowryChild child=new DowryChild();
		System.out.println(child.name);
		System.out.println(child.varaDakshine);
		System.out.println(child.leagal);

	}

}
