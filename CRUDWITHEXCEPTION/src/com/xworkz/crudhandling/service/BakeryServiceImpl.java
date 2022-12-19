package com.xworkz.crudhandling.service;


import com.xworkz.crudhandling.dto.BakeryDTO;
import com.xworkz.crudhandling.exception.InvalidDataException;
import com.xworkz.crudhandling.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	private BakeryRepository repository;

	public BakeryServiceImpl(BakeryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidDataException {
		System.out.println("Validating and saving bakery details" + dto);
		String name = dto.getName();
		String special = dto.getSpecial();
		double price = dto.getPrice();
		String area = dto.getArea();

		boolean validName = false;
		boolean validSpecial = false;
		boolean validPrice = false;
		boolean validArea = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid name :" + name);
			validName = true;
		} else {
			System.err.println("Invalid name");
		}

		if (special != null && special.length() >= 4 && special.length() <= 20) {
			System.out.println("Valid special" + special);
			validSpecial = true;
		} else {
			System.err.println("Invalid special");
		}
		if (price > 0) {
			System.out.println("valid price" + price);
			validPrice = true;
		} else {
			System.out.println("Invalid price");
		}
		if (area != null && area.length() >= 4 && area.length() <= 20) {
			System.out.println("Valid area" + area);
			validArea = true;
		} else {
			System.out.println("Invalid area");
		}
		if (validName && validSpecial && validPrice && validArea) {
			System.out.println("Valid data and can store data ");
			boolean saved=this.repository.store(dto);
			System.out.println("Data is saved sucessfully"+saved);
			return saved;
		}
		
		throw new InvalidDataException();

		
	}

}
