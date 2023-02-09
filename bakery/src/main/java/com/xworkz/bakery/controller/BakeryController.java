package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	private BakeryService service;

	public BakeryController() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@PostMapping("/bakery")
	public String oNbakeryController(BakeryDTO bakeryDto, Model model) {
		System.out.println("running bakeryController" + bakeryDto);
		model.addAttribute("name", bakeryDto.getName());
		model.addAttribute("owner", bakeryDto.getOwner());
		model.addAttribute("wife", bakeryDto.getWife());
		model.addAttribute("married", bakeryDto.isMarried());
		model.addAttribute("famous", bakeryDto.isMarried());
		model.addAttribute("since", bakeryDto.getSince());
		boolean saved = this.service.validateAndSave(bakeryDto);
		System.out.println("Saved" + saved);

		return "display.jsp";

	}

}
