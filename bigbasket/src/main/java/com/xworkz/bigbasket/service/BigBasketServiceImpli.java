package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.stereotype.Service;
import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.entity.BigBasketEntity;
import com.xworkz.bigbasket.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpli implements BigBasketService {

	private BigBasketRepository basketRepository;

	public BigBasketServiceImpli() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("constraintViolations exist return constraintViolations");
			return violations;
		} else {
			System.out.println("constraintViolations does not exist data is good");
			BigBasketEntity entity = new BigBasketEntity();
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setPhoneNumber(dto.getPhoneNumber());
			entity.setPassword(dto.getPassword());
			entity.setItem(dto.getItem());
			entity.setPrice(dto.getPrice());
			entity.setColor(dto.getColor());
			entity.setQuantity(dto.getQuantity());
			entity.setArea(dto.getArea());
			entity.setPay(dto.getPay());
			boolean saved = this.basketRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}

	}

}
