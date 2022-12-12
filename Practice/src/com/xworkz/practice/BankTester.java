package com.xworkz.practice;

public class BankTester {

	public static void main(String[] args) {

	BankDto dto = new BankDto("Sunil", 50000);
	BankDto dto1  = new BankDto("Akshar",40000);

	Bank bank = new BankImpl();
	bank.checkAccount();
	bank.getAccountDetails(dto);
	
	Bank bank2 = new BankImpl();
	bank2.checkAccount();
	bank2.getAccountDetails(dto1);
	
	}
  
}
