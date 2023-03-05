package com.xworkz.trimmer.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.trimmer.dto.TrimmerDTO;
import com.xworkz.trimmer.entity.TrimmerEntity;
import com.xworkz.trimmer.repository.TrimmerRepository;

@Service
public class TrimmerServiceImpli implements TrimmerService {
	@Autowired
	private TrimmerRepository repository;

	public TrimmerServiceImpli() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<TrimmerDTO>> validateAndSave(TrimmerDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TrimmerDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in DTO" + dto);
			return violations;
		} else {
			System.out.println("Violations are not there in dto and can save data");
			TrimmerEntity entity = new TrimmerEntity();
			entity.setCompany(dto.getCompany());
			entity.setColor(dto.getColor());
			entity.setType(dto.getType());
			entity.setSpeed(dto.getSpeed());
			entity.setPrice(dto.getPrice());
			boolean saved = this.repository.save(entity);
			System.out.println("Enity data is saved" + saved);
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
				dto.setCompany(entity.getCompany());
				dto.setSpeed(entity.getSpeed());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				dto.setColor(entity.getColor());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return TrimmerService.super.findById(id);
	}

	@Override
	public List<TrimmerDTO> findByCompany(String company) {
		System.out.println("Running find by Company in service" + company);
		if (company != null && !company.isEmpty()) {
			System.out.println("Company is valid ..calling repo");
			List<TrimmerEntity> entities = this.repository.findByCompany(company);
			List<TrimmerDTO> listOfDto = new ArrayList<TrimmerDTO>();
			for (TrimmerEntity trimmerEntity : entities) {
				TrimmerDTO dto = new TrimmerDTO();
				dto.setCompany(trimmerEntity.getCompany());
				dto.setId(trimmerEntity.getId());
				dto.setColor(trimmerEntity.getColor());
				dto.setType(trimmerEntity.getType());
				dto.setSpeed(trimmerEntity.getSpeed());
				dto.setPrice(trimmerEntity.getPrice());
				listOfDto.add(dto);
			}
			System.out.println("Size of the dtos " + listOfDto.size());
			System.out.println("Size of entities" + entities.size());
			return listOfDto;
		} else {
			System.out.println("Company is invalid");
		}

		return TrimmerService.super.findByCompany(company);
	}

	@Override
	public Set<ConstraintViolation<TrimmerDTO>> validateAndUpdate(TrimmerDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TrimmerDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in DTO" + dto);
			return violations;
		} else {
			System.out.println("Violations are not there in dto and can save data");
			TrimmerEntity entity = new TrimmerEntity();
			entity.setCompany(dto.getCompany());
			entity.setColor(dto.getColor());
			entity.setType(dto.getType());
			entity.setSpeed(dto.getSpeed());
			entity.setPrice(dto.getPrice());
			entity.setId(dto.getId());
			boolean update = this.repository.update(entity);
			System.out.println(entity);
			System.out.println("Enity data is updated" + update);
			return Collections.emptySet();
		}

	}

	@Override
	public boolean validateAndDelete(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running validateAndDelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted = this.repository.delete(id);
			System.out.println("delete" + deleted);
			return deleted;
		}

	}

}
