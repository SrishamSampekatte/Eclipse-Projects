package com.xworkz.rules.follow;

import com.xworkz.rules.made.Institute;
import com.xworkz.rules.made.PayingGuest;

public class XworkzRajajiNagar implements Institute, DevelopmentInstitute, TestingInstitute,PayingGuest {

	@Override
	public boolean interview() {
		System.out.println("Runnning interview");
		return true;
		
		
	}

	@Override
	public boolean training() {
		System.out.println("Runnning training");
		return true;
		
		
	}

	@Override
	public String placement() {
		System.out.println("Runnning placement");
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean white() {
		// TODO Auto-generated method stub
		return false;
	}

}
