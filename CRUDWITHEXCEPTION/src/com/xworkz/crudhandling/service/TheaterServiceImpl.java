package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.TheaterDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
	private TheaterRepository repository;

	public TheaterServiceImpl(TheaterRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(TheaterDTO dto) throws InvalidDataException, InvalidDataException {
		System.out.println("Validating and saving place data" + dto);

		String name = dto.getName();
		int id = dto.getId();
		String brand = dto.getBrand();
		int seats = dto.getSeats();

		boolean validName = false;
		boolean validId = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid name " + name);
			validName = true;
		} else {
			System.out.println("Invalid name");
		}
		if (id != 0 && id >= 4 && id <= 20) {
			System.out.println("Valid Id" + id);
			validId = true;
		} else {
			System.out.println("Invalid id");
		}

		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("Valid nearBy" + brand);
			validBrand = true;
		} else {
			System.out.println("Invalid Brand");
		}
		if (seats != 0 && seats >= 4 && id <= 20) {
			System.out.println("Valid Id" + seats);
			validSeats = true;
		} else {
			System.out.println("Invalid id");

			if (validName && validId && validBrand && validBrand && validSeats) {
				System.out.println("Data is valid and can store ");
				boolean saved = this.repository.save(dto);
				System.out.println("data is saved successfully" + saved);
				return saved;
			}
			
		}
		throw new InvalidDataException();
	}
}
