package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;

@Service

public class ValentineServiceImpl implements ValentineService {
	public ValentineServiceImpl() {
		System.out.println("Create ValentineServiceImpl ");
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("constraintViolations exist return constraintViolations");
			return violations;
		} else {
			System.out.println("constraintViolations does not exist data is good");
		}
		return Collections.emptySet();

	}

}
