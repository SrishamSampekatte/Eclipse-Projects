package com.xworkz.crudhandling.boot;

import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.PlaceRepository;
import com.xworkz.crudhandling.repository.PlaceRepositoryImpl;
import com.xworkz.crudhandling.service.PlaceService;
import com.xworkz.crudhandling.service.PlaceServiceImpl;

public class PlaceRunner {
	private PlaceDTO placeDTO;

	public static void main(String[] args) {
		PlaceDTO placeDTO = new PlaceDTO("Chitradurga", "Kallina Kote",50, "Vani Vilasa Dam", "Karnata", "Srisham",
				"System");
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepository);
		
		try {
			System.out.println("After Validation");
			placeService.saveAndValidate(placeDTO);
		    } 
		catch (InvalidDataException e) {

		}

	}

}
