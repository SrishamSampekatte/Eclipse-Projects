package com.xworkz.trimmer.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.trimmer.dto.TrimmerDTO;

public interface TrimmerService {
	Set<ConstraintViolation<TrimmerDTO>> validateAndSave(TrimmerDTO dto);

	default TrimmerDTO findById(int id) {
		return null;
	}

	default List<TrimmerDTO> findByCompany(String company) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<TrimmerDTO>> validateAndUpdate(TrimmerDTO dto);
	
	
	default boolean validateAndDelete(int id) {
		return false;
	}

}
