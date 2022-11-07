package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.DistrictCourt;
import com.xworkz.inheherit.child.HighCourt;
import com.xworkz.inheherit.child.SupremeCourt;
import com.xworkz.inheherit.thing.Court;

public class CourtRunner {

	public static void main(String[] args) {
		Court court=new Court();
		System.out.println(court.name);
		System.out.println(court.noOfJudges);
		System.out.println(" ");
		
		SupremeCourt sc=new SupremeCourt();
		System.out.println(sc.nameOfSC);
		System.out.println(sc.location);
		System.out.println(sc.name);
		System.out.println(sc.noOfJudges);
		
		Court court1=(SupremeCourt)sc;
		System.out.println(court1.name);
		System.out.println(court1.noOfJudges);
		System.out.println(" ");

		
		HighCourt hc=new HighCourt();
		System.out.println(hc.highcourtName);
		System.out.println(hc.noOfLawyers);
		System.out.println(hc.name);
		System.out.println(hc.noOfJudges);
		
		Court c1=(Court)hc;
		System.out.println(c1.name);
		System.out.println(c1.noOfJudges);
		System.out.println(" ");
		
		DistrictCourt dc=new DistrictCourt();
		System.out.println(dc.courtLoc);
		System.out.println(dc.pinCode);
		System.out.println(dc.name);
		System.out.println(dc.noOfJudges);
		
		Court c2=(DistrictCourt)dc;
		System.out.println(c2.name);
		System.out.println(c2.noOfJudges);
	}

	
	

}
