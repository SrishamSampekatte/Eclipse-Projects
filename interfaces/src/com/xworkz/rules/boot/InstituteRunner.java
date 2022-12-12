package com.xworkz.rules.boot;

import com.xworkz.rules.made.Institute;
import com.xworkz.rules.made.PayingGuest;
import com.xworkz.rules.rules.DevelopmentInstitute;
import com.xworkz.rules.rules.TestingInstitute;
import com.xworkz.rules.rules.XworkzRajajiNagar;

public class InstituteRunner {

	public static void main(String[] args) {
		Institute institute=new XworkzRajajiNagar ();
		institute.placement();
		institute.training();
		System.out.println("-------------------");
		
		DevelopmentInstitute di=new XworkzRajajiNagar ();
		di.interview();
		
		System.out.println("-------------------");
		
		TestingInstitute ti=new XworkzRajajiNagar ();
		ti.interview();
		
		System.out.println("------------------");
		
	
		XworkzRajajiNagar xworkz=new XworkzRajajiNagar ();
		xworkz.interview();
		xworkz.placement();
		xworkz.training();
		
		System.out.println("------------------------- ");
		
		
		PayingGuest pg=new XworkzRajajiNagar ();
		pg.pay();
		pg.white();
		
		
		
		 
		

	}

}
