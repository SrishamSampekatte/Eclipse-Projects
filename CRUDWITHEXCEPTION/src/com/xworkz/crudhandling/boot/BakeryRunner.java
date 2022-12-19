package com.xworkz.crudhandling.boot;

import com.xworkz.crudhandling.dto.BakeryDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.BakeryRepository;
import com.xworkz.crudhandling.repository.BakeryRepositoryImpl;
import com.xworkz.crudhandling.service.BakeryService;
import com.xworkz.crudhandling.service.BakeryServiceImpl;

public class BakeryRunner {
	private BakeryDTO bakeryDTO;

	public static void main(String[] args) {

		BakeryDTO bakeryDTO = new BakeryDTO("Variyar", "RajajiNagar", "Puff", 35.0D, "Srisham", "SYSTEM");
		BakeryRepository bakeryRepository = new BakeryRepositoryImpl();

		BakeryService bakeryService = new BakeryServiceImpl(bakeryRepository);

		try {
			System.out.println("After Validation");
			bakeryService.validateAndSave(bakeryDTO);
		    } 
		catch (InvalidDataException e) {

		}
	}
}