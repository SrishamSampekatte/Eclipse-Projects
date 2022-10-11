package com.Xworkz.power.boot;
import com.Xworkz.power.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector dc=new DistrictCollector();
		System.out.println(dc.name);
		System.out.println(dc.age);
		System.out.println(dc.district);
		System.out.println(dc.batchNo);
	
		dc.name="Selvamani";
		dc.age=42;
		dc.district="Shivamogga";
		dc.batchNo=101;
		
		System.out.println(dc.name);
		System.out.println(dc.age);
		System.out.println(dc.district);
		System.out.println(dc.batchNo);
		

	}

}
