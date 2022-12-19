package com.xworkz.crudhandling.boot;

import com.xworkz.crudhandling.dto.BuildingDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.BuildingRepository;
import com.xworkz.crudhandling.repository.BuildingRepositoryImpl;
import com.xworkz.crudhandling.service.BuildingService;
import com.xworkz.crudhandling.service.BuildingServiceImpl;

public class BuildingRunner {
	private BuildingDTO buildingDTO;

	public static void main(String[] args) {
		BuildingDTO buildingDTO = new BuildingDTO("#76", 2, false, true, "Domestic", "Srisham", "System");
		BuildingRepository repository = new BuildingRepositoryImpl();
		BuildingService buildingService = new BuildingServiceImpl(repository);
		
		try {
			System.out.println("After Validation");
			buildingService.saveAndValidate(buildingDTO);
		    } 
		catch (InvalidDataException e) {

		}

	}

}
