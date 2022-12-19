package com.xworkz.crudhandling.service;


import com.xworkz.crudhandling.dto.BakeryDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.exception.StorageFullException;

public interface BakeryService {
	boolean validateAndSave(BakeryDTO dto) throws StorageFullException,InvalidDataException;
}
