package com.xworkz.practice;

public class BankImpl implements Bank{

	@Override
	public void checkAccount() {
		System.out.println("Account is active");
		
	}

	@Override
	public void getAccountDetails(BankDto dto) {
       
		if(dto == null) {
			System.out.println("Account Holder not found");
		}else {
			System.out.println("Account holder found");
			System.out.println("Account name : " + dto.getName());
			System.out.println("Account bal : " + dto.getBal());
		}
		
		
	}
     
	



}
