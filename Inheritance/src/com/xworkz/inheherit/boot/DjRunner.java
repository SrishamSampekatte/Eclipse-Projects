package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.DJchildClass;
import com.xworkz.inheherit.thing.Dj;

public class DjRunner {

	public static void main(String[] args) {
		Dj dj=new Dj();
		System.out.println(dj.name);
		System.out.println(dj.payment);
		System.out.println(dj.noOfDj);
		System.out.println(" ");
		
		DJchildClass child=new DJchildClass();
		System.out.println(child.name);
		System.out.println(child.noOfDj);
		System.out.println(child.payment);

	}

}
