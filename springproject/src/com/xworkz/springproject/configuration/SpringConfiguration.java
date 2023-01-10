package com.xworkz.springproject.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springproject")

public class SpringConfiguration {
	@Bean("name")
	public String Name() {
		System.out.println(" Registered name with spring");
		String string = new String();
		return string;

	}

	@Bean("location")
	public String location() {
		System.out.println(" Registered location with spring");
		String string = new String();
		return string;

	}

	@Bean("ingredients")
	public String ingredients() {
		System.out.println(" Registered ingredients with spring");
		String string = new String();
		return string;

	}

	@Bean("company")
	public String company() {
		System.out.println(" Registered company with spring");
		String string = new String();
		return string;

	}

	@Bean("owner")
	public String owner() {
		System.out.println(" Registered owner with spring");
		String string = new String();
		return string;

	}

	@Bean("isBigCompany")
	public boolean isBigCompany() {
		System.out.println("Registered bigCompany with spring");
		Boolean boolean1 = new Boolean(true);
		return boolean1;
	}

	@Bean("isOldCompany")
	public boolean isOldCompany() {
		System.out.println("Registered oldCompany with spring");
		Boolean boolean2 = new Boolean(true);
		return boolean2;
	}

	@Bean("isFamous")
	public boolean isFamous() {
		System.out.println("Registered famous with spring");
		Boolean boolean3 = new Boolean(true);
		return boolean3;
	}

	@Bean("isRunningProfit")
	public boolean isRunningProfit() {
		System.out.println("Registered runningProfit with spring");
		Boolean boolean4 = new Boolean(true);
		return boolean4;
	}

	@Bean("companyIsSuccesfull")
	public boolean companyIsSuccesfull() {
		System.out.println("Registered companyIsSuccesfull with spring");
		Boolean boolean5 = new Boolean(true);
		return boolean5;
	}

	@Bean("companyProducts")
	public Double companyProducts() {
		System.out.println("Registered companyProducts with spring");
		Double double1 = new Double(76);
		return double1;
	}

	@Bean("companyIncome")
	public Double companyIncome() {
		System.out.println("Registered companyIncome with spring");
		Double double2 = new Double(175343);
		return double2;
	}

	@Bean("productsHighestPrice")
	public Double ProductsHighestPrice() {
		System.out.println("Registered ProductsHighestPrice with spring");
		Double double3 = new Double(70);
		return double3;
	}

	@Bean("productsLeastPrice")
	public Double ProductsLeastPrice() {
		System.out.println("Registered ProductsLeastPrice with spring");
		Double double4 = new Double(5);
		return double4;
	}

	@Bean("tax")
	public Double Tax() {
		System.out.println("Registered companyTax with spring");
		Double double1 = new Double(20000);
		return double1;
	}

	@Bean("buffName")
	public StringBuffer buffName() {
		System.out.println("Registered companyName  with Spring");
		StringBuffer string = new StringBuffer("Paarleyy");
		return string;
	}

	@Bean("buffBrandName")
	public StringBuffer buffBrandName() {
		System.out.println("Registered brandName  with Spring");
		StringBuffer string = new StringBuffer("Britania");
		return string;
	}

	@Bean("buffCompanyFirstName")
	public StringBuffer buffCompanyFirstName() {
		System.out.println("Registered FirstName  with Spring");
		StringBuffer string = new StringBuffer("Parle-G");
		return string;
	}

	@Bean("buffOwnerLastName")
	public StringBuffer buffOwnerLastName() {
		System.out.println("Registered lastName  with Spring");
		StringBuffer string = new StringBuffer("Seek");
		return string;
	}

	@Bean("buffLocation")
	public StringBuffer buffLocation() {
		System.out.println("Registered location  with Spring");
		StringBuffer string = new StringBuffer("Banglore");
		return string;
	}

	@Bean("companie")
	public StringBuilder companie() {
		System.out.println("Registered companyCEOName  with Spring");
		StringBuilder string = new StringBuilder("Britania");
		return string;
	}

	@Bean("companyName")
	public StringBuilder companyName() {
		System.out.println("Registring companyName  with Spring");
		StringBuilder string = new StringBuilder(" a ");
		return string;
	}

	@Bean("brandName")
	public StringBuilder builderBrandName() {
		System.out.println("Registring brandName  with Spring");
		StringBuilder string = new StringBuilder("b");
		return string;
	}

	@Bean("ownerFirstName")
	public StringBuilder ownerFirstName() {
		System.out.println("Registring ownerFirstName  with Spring");
		StringBuilder string = new StringBuilder("c");
		return string;
	}

	@Bean("ownerLastName")
	public StringBuilder ownerLastName() {
		System.out.println("Registring ownerLastName  with Spring");
		StringBuilder string = new StringBuilder("d");
		return string;
	}

	@Bean("arrayListValues")
	public ArrayList arrayList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		return (ArrayList) list;
	}

	@Bean("mapCityAndPincodes")
	public Map pincodes() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Mumbai", 583481);
		map.put("Mathikai", 577452);
		map.put("Mathimane", 577418);
		map.put("Banglore", 001);
		map.put("Rajajinagar", 002);
		System.out.println(map);
		return map;
	}

}
