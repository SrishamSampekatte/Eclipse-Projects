package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public interface BigBasketService {
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto);
}
