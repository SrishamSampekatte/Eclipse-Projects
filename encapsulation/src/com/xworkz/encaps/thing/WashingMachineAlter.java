package com.xworkz.encaps.thing;

public class WashingMachineAlter {
	public void alterWashin(WashingMachine washinMachine) {
		washinMachine.setBrand(null);
		washinMachine.setModelName(null);
		washinMachine.setFunctionType(null);
		washinMachine.setWashingCapacity(0);
		washinMachine.setWashingMethod(null);
		washinMachine.setHeight(0);
		washinMachine.setWidth(0);
		washinMachine.setDepth(0);
		washinMachine.setWeight(0);
		washinMachine.setMaxSpinSpeed(0);
		washinMachine.setPrice(0);
		System.out.println(washinMachine.getBrand());
		System.out.println(washinMachine.getModelName());
		System.out.println(washinMachine.getFunctionType());
		System.out.println(washinMachine.getWashingCapacity());
		System.out.println(washinMachine.getWashingMethod());
		System.out.println(washinMachine.getHeight());
		System.out.println(washinMachine.getWeight());
		System.out.println(washinMachine.getDepth());
		System.out.println(washinMachine.getWidth());
		System.out.println(washinMachine.getMaxSpinSpeed());
		System.out.println(washinMachine.getPrice());
		
	}

}
