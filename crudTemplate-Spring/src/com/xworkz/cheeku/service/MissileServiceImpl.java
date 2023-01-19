package com.xworkz.cheeku.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.MissileDTO;
import com.xworkz.cheeku.repository.MissileRepository;

@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepository missileRepository;

	public MissileServiceImpl(MissileRepository missileRepository) {
		this.missileRepository = missileRepository;
		System.out.println("Created Service by passing repo from spring ");
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Started validate and save ");
		System.out.println(dto);

		Set<ConstraintViolation<MissileDTO>> voilations = validator.validate(dto);
		if (!voilations.isEmpty()) {
			System.out.println("There are validation errrors");
			voilations.forEach(v -> {
				System.out.println(v.getMessage());
			});
			return true;
		} else {
			System.out.println("Data is valid ");
			boolean saved = missileRepository.save(dto);
			return saved;
		}
	}

}
