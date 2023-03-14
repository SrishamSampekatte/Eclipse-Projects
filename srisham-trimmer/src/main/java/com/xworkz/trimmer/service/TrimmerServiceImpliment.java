package com.xworkz.trimmer.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.trimmer.dto.TrimmerDTO;
import com.xworkz.trimmer.entity.TrimmerEntity;
import com.xworkz.trimmer.repository.TrimmerRepository;

@Service
public class TrimmerServiceImpliment implements TrimmerService {
	public TrimmerServiceImpliment() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Autowired
	private TrimmerRepository repository;

	@Override
	public Set<ConstraintViolation<TrimmerDTO>> validateAndSave(TrimmerDTO dto) {
		Set<ConstraintViolation<TrimmerDTO>> violations = validationMethod(dto);
		if (violations != null && violations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return violations;
		} else {
			System.out.println("Violations are not there in dto and can save data");
			TrimmerEntity trimmerEntity = new TrimmerEntity();
			BeanUtils.copyProperties(dto,trimmerEntity);
			boolean saved = this.repository.save(trimmerEntity);
			System.out.println("Entity data is saved" + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public TrimmerDTO findById(int id) {
		if (id > 0) {
			TrimmerEntity entity = this.repository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id" + id);
				TrimmerDTO dto = new TrimmerDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return TrimmerService.super.findById(id);
	}

	private Set<ConstraintViolation<TrimmerDTO>> validationMethod(TrimmerDTO dto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<TrimmerDTO>> violations = validator.validate(dto);
		return violations;
	}

}
