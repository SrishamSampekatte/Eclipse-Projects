package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpli implements BakeryRepository {
	public BakeryRepositoryImpli() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO bakeryDto) {
		System.out.println("Running save method in Bakery Repository");
		return false;
	}

}
