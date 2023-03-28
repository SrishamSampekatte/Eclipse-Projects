package com.xworkz.project.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.project.dto.SignUpDTO;
import com.xworkz.project.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SignUpController {
	@Autowired
	private SignUpService service;

	public SignUpController() {
		log.info("Created" + getClass().getSimpleName());
	}

	@GetMapping("/saveSignUp")
	public String onSignUp(Model model) {
		log.info("Created onSignUp ");

		return "SignUp";
	}

	@PostMapping("/saveSignUp")
	public String onSignUp(Model model, SignUpDTO dto) {
		log.info("Running on onSignUp post method");
		Set<ConstraintViolation<SignUpDTO>> violations = service.validateAndSave(dto);
		if (violations.isEmpty()) {
			log.info("no volations in contoller go to success page");
			return "SignUpSucess";
		}
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		log.error("volation in controller");
		return "SignUp";

	}

}
