package com.xworkz.validate.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.validate.dto.CMDTO;

public interface CMService {
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);

}
