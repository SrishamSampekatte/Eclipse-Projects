package com.xworkz.constants.association;

public class Job {
	public int salary;
	public String role;
	public boolean bond;
	public Company company;

	public Job(int salary, String role, boolean bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}

	public void setCompany(Company company) {
		this.company = company;

	}

	public void showOff() {
		System.out.println("Printing Job Deatails");
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);

		if (this.company != null) {
			this.company.showOff();

		}

	}

}
