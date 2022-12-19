package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.BuildingDTO;
import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;

public interface BuildingService {
	boolean saveAndValidate(BuildingDTO dto) throws InvalidDataException, InvalidDataException;

}
