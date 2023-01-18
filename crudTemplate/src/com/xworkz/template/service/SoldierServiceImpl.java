package com.xworkz.template.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.template.dto.SoldierDTO;
import com.xworkz.template.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	public SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no arg constructor..");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Starting validate and save");
		System.out.println("dto passed" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> voilations = validator.validate(dto);
		if (!voilations.isEmpty()) {
			System.err.println("There are validation errors");
			voilations.forEach(v -> {
				System.err.println("Violating message" + v.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is Valid ");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo" + saved);
			return saved;
		}
	}

}
