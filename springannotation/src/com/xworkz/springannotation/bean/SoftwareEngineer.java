package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("nameofSE")
	private String name;
	@Autowired
	@Qualifier("saleryOfSE")
	private double salery;
	@Autowired
	@Qualifier("companyofSE")
	private String companyName;
	@Autowired
	@Qualifier("expOfSE")
	private double exp;

	public SoftwareEngineer() {
		System.out.println("Created Software Engineer using spring ");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salery=" + salery + ", companyName=" + companyName + ", exp=" + exp
				+ "]";
	}
}
