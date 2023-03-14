package com.xworkz.trimmer.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.trimmer.dto.TrimmerDTO;

public interface TrimmerService {

	Set<ConstraintViolation<TrimmerDTO>> validateAndSave(TrimmerDTO dto);

	default TrimmerDTO findById(int id) {
		return null;
	}

}
