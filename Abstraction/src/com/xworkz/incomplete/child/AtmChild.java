package com.xworkz.incomplete.child;

import com.xworkz.incomplete.thing.Atm;

public class AtmChild extends Atm {
	@Override
	public void withdraw() {
		System.out.println(" Printing withdraw without body using abstarct method ");

	}

	public void checkbalance() {
		System.out.println(" Printing check balance ");

	}
}
