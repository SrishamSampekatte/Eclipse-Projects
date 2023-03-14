package com.xworkz.trimmer.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.trimmer.dto.TrimmerDTO;
import com.xworkz.trimmer.service.TrimmerService;

@Controller
@RequestMapping("/")
public class TrimmerController {
	@Autowired
	private TrimmerService service;

	private List<String> colors = Arrays.asList("Blue", "Black", "Yellow", "Green");
	private List<Integer> speeds = Arrays.asList(1, 2, 3, 5, 7, 9);
	private List<Integer> charge = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	public TrimmerController() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@GetMapping("/trimmerRegistration")
	public String onTrimmer(Model model) {
		System.out.println("Running on trimmer Registration method");
		List<String> colors = Arrays.asList("Blue", "Black", "Yellow", "Green");
		List<Integer> speeds = Arrays.asList(1, 2, 3, 5, 7, 9);
		List<Integer> charge = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		model.addAttribute("colors", colors);
		model.addAttribute("speeds", speeds);
		model.addAttribute("charge", charge);
		return "TrimmerRegistration";
	}

	@PostMapping("/trimmerRegistration")
	public String onTrimmer(Model model, TrimmerDTO dto) {
		System.out.println("Running onTrimmer Post method " + dto);
		Set<ConstraintViolation<TrimmerDTO>> violations = this.service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to sucess page");
			return "TrimmerRegistrationSucess";
		}
		model.addAttribute("colors", colors);
		model.addAttribute("speeds", speeds);
		model.addAttribute("charge", charge);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "TrimmerRegistration";
	}
@GetMapping("/searchId")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id" + id);
		TrimmerDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not Found");
		}
		return "TrimmerSearch";
	}

}
