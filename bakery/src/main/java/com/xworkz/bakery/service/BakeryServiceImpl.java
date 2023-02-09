package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepository repository;

	public BakeryServiceImpl() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO bakeryDto) {
		System.out.println("Running validateAndSave in BakeryServiceImpli");
		boolean saved = this.repository.save(bakeryDto);
		System.out.println("Saved in Repository" + saved);
		return false;
	}

}
