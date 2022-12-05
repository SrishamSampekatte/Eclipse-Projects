package com.xworkz.interfaces.impliments;

import com.xworkz.interfaces.rules.CanaraBank;

public class ReserveBankOfIndia {
	private CanaraBank bank;

	public ReserveBankOfIndia() {
		System.out.println("Runnning the Default Constructor");
	}

	public ReserveBankOfIndia(CanaraBank bank) {
		this.bank = bank;
		System.out.println("Running param constructor or initializing datatype CanaraBank in constructor");

	}
	public void checkBank() {
		System.out.println("Running checBak method");
		if (bank!= null) {
			long maxAmount=this.bank.maxAmount();
			int minAmount=this.bank.minAmount();
			if(maxAmount==875698548 && minAmount==5678) {
				System.out.println("Bank is rich");
			}
			else {
				System.out.println("Bank is poor");
			}
		}
		
	}
	
	

}
