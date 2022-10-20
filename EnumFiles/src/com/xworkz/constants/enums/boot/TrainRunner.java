package com.xworkz.constants.enums.boot;


import com.xworkz.constants.enums.Train;
import com.xworkz.constants.Station;
import com.xworkz.constants.Type;


public class TrainRunner {

	public static void main(String[] args) {
		
		System.out.println(" accessing the ref values of enum by calling methods");
		
		Train train=new Train(14587,Station.KSR_BENGALURU,Type.AC);
		
		train.ugibandi();
		
		
	

	}

}
