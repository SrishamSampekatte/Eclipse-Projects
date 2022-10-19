package com.xworkz.variables.boot;

import com.xworkz.variables.MotorCycle;

public class MotorCycleRunner {

	public static void main(String[] args) {
		String[] color={"white","red","blue","black","grey","silver"};
		long[] price={7000,75000,80000,85000,90000,95000};
		int[] mileage = {14,15,16,17,18,19,20};
		String[] tyres= {"MRF","CEAT","APOLLO","GOODYEAR","PIRELLI","MICHELIN"};
		String[] petrolEngine= {"TB","TFSI","TwinAir","EcoBoost","GDi","MIVEC"};
		int[] speedMeter= {80,120,160,180,200,220};
		
		
		MotorCycle bike=new MotorCycle("ramesh",color,price,mileage,true,tyres,petrolEngine,speedMeter);
		bike.display();
		

	}

}
