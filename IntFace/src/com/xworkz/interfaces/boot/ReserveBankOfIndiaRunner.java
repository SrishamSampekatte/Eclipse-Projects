package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.impliments.ReserveBankOfIndia;
import com.xworkz.interfaces.rules.CanaraBank;

public class ReserveBankOfIndiaRunner {

	public static void main(String[] args) {
		CanaraBank can=new CanaraBank();
		ReserveBankOfIndia rbi=new ReserveBankOfIndia(can);
		rbi.checkBank();

	}

}
