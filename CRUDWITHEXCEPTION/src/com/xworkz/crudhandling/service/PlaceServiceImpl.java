package com.xworkz.crudhandling.service;

import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {
	private PlaceRepository repository;

	public PlaceServiceImpl(PlaceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(PlaceDTO dto) throws InvalidDataException {
		System.out.println("Validating and saving place data" + dto);

		String name = dto.getName();
		String famousFor = dto.getFamousFor();
		double entryFee = dto.getEntryFee();
		String nearBy = dto.getNearBy();
		String state = dto.getState();

		boolean validName = false;
		boolean validFamosfor = false;
		boolean validEntryFee = false;
		boolean validNearBy = false;
		boolean validState = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid name " + name);
			validName = true;
		} else {
			System.out.println("Invalid name");
		}
		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("Valid famousFor" + famousFor);
			validFamosfor = true;
		} else {
			System.out.println("Invalid famousFor ");
		}
		if (entryFee > 0) {
			System.out.println("Valid entry fee");
			validEntryFee = true;
		} else {
			System.out.println("Invalid entry fee ");
		}
		if (nearBy != null && nearBy.length() >= 4 && nearBy.length() <= 20) {
			System.out.println("Valid nearBy" + nearBy);
			validNearBy = true;
		} else {
			System.out.println("Invalid nearBy ");
		}
		if (state != null && state.length() >= 4 && state.length() <= 20) {
			System.out.println("Valid state" + state);
			validState = true;
		} else {
			System.out.println("Invalid state ");
		}

		if (validName && validFamosfor && validEntryFee && validNearBy && validState) {
			System.out.println("Data is valid and can store ");
			boolean saved = this.repository.save(dto);
			System.out.println("data is saved successfully" + saved);
			return saved;
		}
		throw new InvalidDataException();
	}

}
