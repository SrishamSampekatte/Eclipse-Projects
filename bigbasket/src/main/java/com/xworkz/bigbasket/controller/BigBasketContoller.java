package com.xworkz.bigbasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.service.BigBasketService;

@Controller
@RequestMapping("/bigbasket")
public class BigBasketContoller {
	@Autowired
	private BigBasketService basketService;
	List<String> items = Arrays.asList("Watch", "Iphone", "Camera", "Television");
	List<String> areas = Arrays.asList("Rajaji nagar", "Bengaluru", "Sampekatte");

	public BigBasketContoller() {
		System.out.println("Created " + getClass().getSimpleName());
	}

	@GetMapping
	public String onBasket(Model model) {
		System.out.println("Running onBasket Get method");
		List<String> items = Arrays.asList("Watch", "Iphone", "Camera", "Television");
		List<String> areas = Arrays.asList("Rajaji nagar", "Bengaluru", "Sampekatte");
		model.addAttribute("items", items);
		model.addAttribute("areas", areas);
		return "Bigbasket";
	}

	@PostMapping
	public String onBasket(Model model, BigBasketDTO dto) {
		System.out.println("Running onBasket post method" + dto);
		Set<ConstraintViolation<BigBasketDTO>> violations = basketService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to sccess page");
			return "BigBasketSucess";

		}
		model.addAttribute("items", items);
		model.addAttribute("areas", items);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);

		return "Bigbasket";

	}

}
