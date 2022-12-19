package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.BakeryDTO;

import com.xworkz.crudhandling.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository {
	private BakeryDTO[] dtos = new BakeryDTO[5];
	private int currentIndex = 0;
	
	@Override
	public boolean store(BakeryDTO dto)throws StorageFullException {
		if (this.currentIndex >= this.dtos.length) {
			System.err.println("Bakery Size is exceeded");
			throw new StorageFullException("Bakery size exceeded ");
		}
		this.dtos[this.currentIndex] = dto;
		this.currentIndex++;

		return true;
	}

}
