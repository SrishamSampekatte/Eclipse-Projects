package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.Moon;
import com.xworkz.inheherit.thing.Satellite;

public class SatelliteRunner {
	public static void main(String[] args) {
		Satellite sat =new Satellite("Ariane Passenger Payload Experiment (APPLE)","Communication",false);
		sat.display();
		System.out.println(" ");
		
		Moon moon=new Moon("Moon"," leading to a relatively stable climate",true,1737.4);
		moon.display();
	}
	
	
}
