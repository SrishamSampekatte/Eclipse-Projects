package com.xworkz.crudopp.service;

import com.xworkz.crudopp.constant.PizzaSize;
import com.xworkz.crudopp.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("Running validateAndSave " + dto);

		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		boolean cheese = dto.isCheese();
		double price = dto.getPrice();
		int quantity = dto.getQuantity();
		String type = dto.getType();

		boolean validName = false;
		boolean validCompany = false;
		boolean validSize = false;
		boolean validCheese = false;
		boolean validPrice = false;
		boolean validQuantity = false;
		boolean validType = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid pizza name" + name);
			validName = true;
		} else {
			System.err.println("Invalid Pizza name");
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Valid pizza company name" + company);
			validCompany = true;
		} else {
			System.err.println("Invalid Pizza Company name");
		}

		if (size != null) {
			System.out.println("Valid Pizza size" + size);
			validSize = true;
		} else {
			System.err.println("Invalid Pizza size");
		}

		if (price >= 50 && price <= 2000) {
			System.out.println("Valid pizza price" + price);
			validPrice = true;
		} else {
			System.err.println("Invalid Pizza Price");
		}

		if (quantity != 0 && quantity >= 3 && quantity <= 20) {
			System.out.println("Valid pizza quantity" + quantity);
			validQuantity = true;
		} else {
			System.err.println("Invalid Pizza quantity");
		}

		if (type != null && type == "Veg" || type == "Non-Veg") {
			System.out.println("Valid pizza type" + type);
			validType = true;
		} else {
			System.err.println("Invalid Pizza Type");
		}

		return true;
	}

}
