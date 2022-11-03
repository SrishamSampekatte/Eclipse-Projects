package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.WashingMachine;
import com.xworkz.encaps.thing.WashingMachineAlter;

public class WashingMachineRunner {
	public static void main(String[] args) {
		WashingMachine washingMachine=new WashingMachine();
		System.out.println(washingMachine.getBrand());
		System.out.println(washingMachine.getModelName());
		System.out.println(washingMachine.getFunctionType());
		System.out.println(washingMachine.getWashingCapacity());
		System.out.println(washingMachine.getWashingMethod());
		System.out.println(washingMachine.getHeight());
		System.out.println(washingMachine.getWeight());
		System.out.println(washingMachine.getDepth());
		System.out.println(washingMachine.getWidth());
		System.out.println(washingMachine.getMaxSpinSpeed());
		System.out.println(washingMachine.getPrice());
		System.out.println("==================================");
		WashingMachineAlter washingMachineAlter = new WashingMachineAlter();
		washingMachineAlter.alterWashin(washingMachine);

	}


}
