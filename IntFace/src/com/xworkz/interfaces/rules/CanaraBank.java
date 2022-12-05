package com.xworkz.interfaces.rules;

public class CanaraBank implements BankRules {

	@Override
	public long maxAmount() {
		System.out.println("Running Max Amount in Bank");
		return 65427384;
	}

	@Override
	public int minAmount() {
		System.out.println("Running Min Amount in Bank");
		return 10000;
	}

}
