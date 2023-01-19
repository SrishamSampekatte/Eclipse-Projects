package com.xworkz.cheeku.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.FirstAidDTO;
import com.xworkz.cheeku.repository.FirstAidRepository;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepository firstAidRepository;

	public FirstAidServiceImpl(FirstAidRepository firstAidRepository) {
		this.firstAidRepository = firstAidRepository;
		System.out.println("Created Service by passing repo from spring ");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Validation and save Starts");
		System.out.println(dto);

		Set<ConstraintViolation<FirstAidDTO>> voilations = validator.validate(dto);
		if (!voilations.isEmpty()) {
			System.out.println("There are validation error");
			voilations.forEach(e -> {
				System.out.println(e.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is Valid");
			boolean saved = firstAidRepository.save(dto);
			return saved;
		}
	}

}
