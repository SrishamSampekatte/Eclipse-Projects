package com.xworkz.curdSpring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.curdSpring.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Executing validating and Save start...");
		System.out.println("Dto passed : " + dto);
		if(dto!=null) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> voilations = validator.validate(dto);
		if (!voilations.isEmpty()) {
			System.err.println("There is an error");
			voilations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}
		
		}
		System.out.println("No validation errors");
		return true;
	}

}
