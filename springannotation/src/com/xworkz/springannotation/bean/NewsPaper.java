package com.xworkz.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("paperId")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("paperLanguage")
	private String language;
	private double price;

	@Autowired
	public NewsPaper(@Qualifier("paperName") String name, @Qualifier("paperOwner") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Autowired
	@Qualifier("paperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language + "]";
	}
	

}