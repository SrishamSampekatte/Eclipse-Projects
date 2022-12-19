package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.RailwayStationDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;


import com.xworkz.crudhandling.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {
	private RailwayStationRepository repository;

	public RailwayStationServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		System.out.println("Validating and saving Railwaysatation data" + dto);

		String name = dto.getName();
		int noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double platformTicketPrice = dto.getPlatformTicketPrice();

		boolean validName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validPlatformTicketPrice = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid name" + name);
			validName = true;
		} else {
			System.err.println("Invalid name");
		}

		if (noOfPlatforms > 0) {
			System.out.println("valid platform" + noOfPlatforms);
			validNoOfPlatforms = true;
		} else {
			System.err.println("invalid no of platform");
		}

		if (area != null && area.length() >= 4 && area.length() <= 20) {
			System.out.println("valid area" + area);
			validArea = true;
		} else {
			System.err.println("invalid area");
		}
		if (platformTicketPrice > 0) {
			System.out.println("valid platformTicketPrice" + platformTicketPrice);
			validPlatformTicketPrice = true;
		} else {
			System.err.println("Invalid ticket price");
		}

		if (validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("Data is valid and can store ");
			boolean saved = this.repository.save(dto);
			System.out.println("data is saved successfully" + saved);
			return saved;
		}
		throw new InvalidDataException();

	}

}
