package com.xworkz.crudopp.boot;

import java.time.LocalDateTime;

import com.xworkz.crudopp.constant.PizzaSize;
import com.xworkz.crudopp.dto.PizzaDTO;
import com.xworkz.crudopp.service.PizzaService;
import com.xworkz.crudopp.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaDTO pizza = new PizzaDTO();

		pizza.setName("Cheese Corn");
		pizza.setCompany("Domino's");
		pizza.setPrice(99);
		pizza.setCheese(true);
		pizza.setSize(PizzaSize.MEDIUM);
		pizza.setQuantity(4);
		pizza.setType("Veg");

		pizza.setCreatedBy("Srisham");
		pizza.setCreatedDate(LocalDateTime.now());
		pizza.setUpdatedBy("SYSTEM");
		pizza.setUpdatedDate(LocalDateTime.now());

		System.out.println("---------------------");

		PizzaService service = new PizzaServiceImpl();
		boolean saved=service.validateAndSave(pizza);
		System.out.println(saved);

	}

}
