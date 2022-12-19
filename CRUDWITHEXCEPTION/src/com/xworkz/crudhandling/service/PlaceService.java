package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;

public interface PlaceService {
	
	boolean saveAndValidate(PlaceDTO dto) throws InvalidDataException,InvalidDataException;

}
