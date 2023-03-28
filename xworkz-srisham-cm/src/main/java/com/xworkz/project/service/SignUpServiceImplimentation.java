package com.xworkz.project.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.SignUpDTO;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImplimentation implements SignUpService {

	@Autowired
	private SignUpRepository repository;

	@Override
	public Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO dto) {
		Set<ConstraintViolation<SignUpDTO>> violations = validateMethod(dto);
		if (  !(dto.getPassword().equals(violations))) {
			log.info("Violations in DTO" + dto);
			return violations;
		} else {
			log.info("Violations are not there in dto and can save data");
			SignUpEntity entity = new SignUpEntity();

			BeanUtils.copyProperties(dto, entity);

			boolean saved = this.repository.save(entity);
			log.info("Enity data is saved" + saved);
			return Collections.emptySet();
		}

	}

	private Set<ConstraintViolation<SignUpDTO>> validateMethod(SignUpDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SignUpDTO>> violations = validator.validate(dto);
		return violations;
	}

}
