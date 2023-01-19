package com.xworkz.cheeku.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.ResortDTO;
import com.xworkz.cheeku.repository.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepository resortRepository;

	public ResortServiceImpl(ResortRepository resortRepository) {
		this.resortRepository = resortRepository;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Started validate and Save");
		System.out.println(dto);
		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("There are validation errors");
			violations.forEach(v -> {
				System.out.println(v.getMessage());
			});
			return true;
		} else {
			System.out.println("Data is valid ");
			boolean saved = resortRepository.save(dto);
			return saved;
		}
	}

}
