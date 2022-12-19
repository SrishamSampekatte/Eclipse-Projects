package com.xworkz.crudopp.service;

import com.xworkz.crudopp.constant.HelmetColor;
import com.xworkz.crudopp.constant.HelmetType;
import com.xworkz.crudopp.dto.HelmetDTO;
import com.xworkz.crudopp.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {
	
	HelmetRepository helmetRepository;
	
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
		
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("Running validation" + dto);
		String company = dto.getCompany();
		HelmetType type = dto.getType();
		double price = dto.getPrice();
		HelmetColor color = dto.getColor();

		boolean validComapany = false;
		boolean validType = false;
		boolean validPrice = false;
		boolean validColor = false;

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Valid helmet company");
			validComapany=true;
		} else {
			System.err.println("Invalid helmet company ");
		}

		if (type != null) {
			System.out.println("Valid helmet type");
			validType=true;
			
		} else {
			System.err.println("Invalid helmet type");
		}

		if (price >= 500 && price <= 1000) {
			System.out.println(" Valid price of the helmet");
		} else {
			System.err.println("Invalid price");
		}

		if (color != null) {
			System.out.println("Valid color");
		} else {
			System.err.println("Invalid color of the helmet");
		}
		if(validComapany && validType && validPrice && validColor) {
			System.out.println("HelmetDTO  is valid ,can save using repository");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println(saved);
		}

		return true;
	}

}
