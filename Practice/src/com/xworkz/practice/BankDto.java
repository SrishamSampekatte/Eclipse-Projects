package com.xworkz.practice;

public class BankDto {
	
	private String name;
	private int bal;

	public BankDto() {
	}
	
	public BankDto(String name, int bal) {
		this.name = name;
		this.bal = bal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	
	
}
