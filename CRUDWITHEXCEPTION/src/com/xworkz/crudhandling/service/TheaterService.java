package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.TheaterDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;

public interface TheaterService {
	boolean saveAndValidate(TheaterDTO dto) throws InvalidDataException, InvalidDataException;

}
