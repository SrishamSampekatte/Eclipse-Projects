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
	private List<String> colors = Arrays.asList("Black", "Blue", "Yellow");
	private List<String> types = Arrays.asList("Body", "Beard", "Nose");
	private List<Integer> speeds = Arrays.asList(1, 2, 3, 5, 7, 9);

	public TrimmerController() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@GetMapping("/trimmer")
	public String onTrimmer(Model model) {
		System.out.println("Running onTrimmer get method");
		List<String> colors = Arrays.asList("Black", "Blue", "Yellow");
		List<String> types = Arrays.asList("Body", "Beard", "Nose");
		List<Integer> speeds = Arrays.asList(1, 2, 3, 5, 7, 9);
		model.addAttribute("speeds", speeds);
		model.addAttribute("colors", colors);
		model.addAttribute("types", types);
		return "Trimmer";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		TrimmerDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "TrimmerSearch";
	}

	@PostMapping("/trimmer")
	public String onAeroplane(Model model, TrimmerDTO dto) {
		System.out.println("Running onTrimmer Post method " + dto);
		Set<ConstraintViolation<TrimmerDTO>> violations = this.service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page");
			return "Trimmer";
		}
		model.addAttribute("types", types);
		model.addAttribute("colors", colors);
		model.addAttribute("speeds", speeds);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "Trimmer";
	}

}
