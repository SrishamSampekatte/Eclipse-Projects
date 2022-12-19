package com.xworkz.crudhandling.boot;

import com.xworkz.crudhandling.dto.RailwayStationDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;

import com.xworkz.crudhandling.repository.RailwayStationRepository;
import com.xworkz.crudhandling.repository.RailwayStationRepositoryImpl;
import com.xworkz.crudhandling.service.RailwayStationService;
import com.xworkz.crudhandling.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	private RailwayStationDTO railwayStationDTO;

	public static void main(String[] args) {
		RailwayStationDTO railwayStationDTO = new RailwayStationDTO("Jambagarau", 2, "Sagara", 10, "Srisham", "Nusha");
		RailwayStationDTO railwayStationDTO1 = new RailwayStationDTO("Jambagarau", 2, "Sagara", 10, "Srisham", "Nusha");
		RailwayStationDTO railwayStationDTO2 = new RailwayStationDTO("Jambagarau", 2, "Sagara", 10, "Srisham", "Nusha");
		RailwayStationDTO railwayStationDTO3 = new RailwayStationDTO("Jambagarau", 2, "Sagara", 10, "Srisham", "Nusha");
		RailwayStationDTO railwayStationDTO4 = new RailwayStationDTO("Jambagarau", 2, "Sagara", 10, "Srisham", "Nusha");
		// RailwayStationDTO railwayStationDTO5=new
		// RailwayStationDTO("Jambagarau",2,"Sagara",10,"Srisham","Nusha");

		RailwayStationRepository railwayStationRepository = new RailwayStationRepositoryImpl();

		RailwayStationService service = new RailwayStationServiceImpl(railwayStationRepository);

		try {
			System.out.println("After");
			service.validateAndSave(railwayStationDTO);
			System.out.println(" ");
			service.validateAndSave(railwayStationDTO1);
			System.out.println(" ");
			service.validateAndSave(railwayStationDTO2);
			System.out.println(" ");
			service.validateAndSave(railwayStationDTO3);
			System.out.println(" ");
			service.validateAndSave(railwayStationDTO4);
			System.out.println(" ");
			// service.validateAndSave(railwayStationDTO5);
			System.out.println(" ");
			// service.validateAndSave(railwayStationDTO3);
		} catch (InvalidDataException e) {

		}

	}

}
