package com.xworkz.springannotation.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("nameOfSoftware")
	private String name;
	@Autowired
	@Qualifier("salery")
	private double salery;
	@Autowired
	@Qualifier("developer")
	private String developer;
	private LocalDate date;
	@Autowired
	@Qualifier("free")
	private boolean free;

	public Software() {
		System.out.println("Created software using Spring ");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", salery=" + salery + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
