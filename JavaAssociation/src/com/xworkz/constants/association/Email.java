package com.xworkz.constants.association;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;

	}

	public void setCompany(Company company) {
		this.company = company;

	}

	public void showOff() {
		System.out.println("Printing Email details");
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		if (this.company != null) {
			this.company.showOff();

		} else {
			System.out.println("The email is null");
		}

	}

}
