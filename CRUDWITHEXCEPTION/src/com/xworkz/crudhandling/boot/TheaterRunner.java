package com.xworkz.crudhandling.boot;

import com.xworkz.crudhandling.dto.TheaterDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.TheaterRepository;
import com.xworkz.crudhandling.repository.TheaterRepositoryImpl;
import com.xworkz.crudhandling.service.TheaterService;
import com.xworkz.crudhandling.service.TheaterServiceImpl;

public class TheaterRunner {
	private TheaterDTO theaterDTO;

	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO("PVR", 1, "Multiplex", 600, "Srisham", "System");
		TheaterRepository repository = new TheaterRepositoryImpl();
		TheaterService theaterService = new TheaterServiceImpl(repository);
		try {
			System.out.println("After Validation");
			theaterService.saveAndValidate(theaterDTO);
		} catch (InvalidDataException e) {

		}

	}

}
