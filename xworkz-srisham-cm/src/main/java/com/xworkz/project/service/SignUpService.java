package com.xworkz.project.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.SignUpDTO;

public interface SignUpService {
	Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO dto);
}
