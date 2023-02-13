package com.xworkz.validate.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.validate.dto.CMDTO;

@Service
public class CMServiceImpli implements CMService {
	public CMServiceImpli() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exist return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good");
		}
		return Collections.emptySet();
	}
}
