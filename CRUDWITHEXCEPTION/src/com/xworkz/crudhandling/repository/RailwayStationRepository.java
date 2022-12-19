package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.RailwayStationDTO;
import com.xworkz.crudhandling.exception.StorageFullException;


public interface RailwayStationRepository {
	boolean save(RailwayStationDTO dto) throws StorageFullException;

}
