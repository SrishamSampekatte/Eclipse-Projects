package com.xworkz.interfaces.rule;

public interface PanCardRepository  {
	boolean register(String card);

	default int total() {
		System.out.println("running total");
		return 10;

	}

}
