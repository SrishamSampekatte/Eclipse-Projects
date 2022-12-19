package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.BuildingDTO;
import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	private BuildingRepository repository;

	public BuildingServiceImpl(BuildingRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(BuildingDTO dto) throws InvalidDataException {
		System.out.println("Validating and saving place data" + dto);

		String no = dto.getNo();
		int floor = dto.getFloor();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		String type = dto.getType();

		boolean validNo = false;
		boolean validFloor = false;
		boolean validType = false;

		if (no != null && no.length() >= 2 && no.length() <= 6) {
			System.out.println("Valid no " + no);
			validNo = true;
		} else {
			System.out.println("Invalid no");
		}

		if (floor > 0) {
			System.out.println("Valid floor");
			validFloor = true;
		} else {
			System.out.println("Invalid floor ");
		}
		if (type != null && type.length() >= 4 && type.length() <= 20) {
			System.out.println("Valid nearBy" + type);
			validType = true;
		} else {
			System.err.println("Invalid type ");
		}

		if (validNo && validFloor && validType) {
			System.out.println("Data is valid and can store ");
			boolean saved = this.repository.save(dto);
			System.out.println("data is saved successfully" + saved);
			return saved;
		}
		throw new InvalidDataException();

	}

}
