package com.xworkz.incomplete.boot;

import com.xworkz.incomplete.child.AtmChild;
import com.xworkz.incomplete.thing.Atm;

public class AtmRunner {

	public static void main(String[] args) {
		Atm child=new AtmChild();
		child.checkbalance();
		System.out.println(" ");
		child.withdraw();

	}

}
