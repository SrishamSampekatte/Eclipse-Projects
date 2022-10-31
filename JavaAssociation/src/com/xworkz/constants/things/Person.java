package com.xworkz.constants.things;

import com.xworkz.constants.association.Email;

import com.xworkz.constants.association.Job;
import com.xworkz.constants.association.Company;

public class Person {
	public String name;
	public Email[] emails;
	public Job job;
	public Company company;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setEmail(Email[] emails) {
		this.emails = emails;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void setCompany(Company company) {
		this.company = company;

	}

	public void showOff() {
		System.out.println("Printing person Details");
		System.out.println(this.name);

		if (this.emails != null) {
			for (int i = 0; i < emails.length; i++) {
				Email email = emails[i];
				System.out.println(email);
				email.showOff();
			}

		} else {
			System.out.println(" Email is Null");

		}

		if (this.job != null) {
			this.job.showOff();
		} else {
			System.out.println("Job is null");
		}
		
		if (this.company!=null) {
			this.company.showOff();
		}
		

	}

}
