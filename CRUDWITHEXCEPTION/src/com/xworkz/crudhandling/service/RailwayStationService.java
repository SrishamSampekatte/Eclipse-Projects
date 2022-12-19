package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.RailwayStationDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.exception.StorageFullException;

public interface RailwayStationService {
	boolean validateAndSave(RailwayStationDTO dto) throws StorageFullException,InvalidDataException;
}
