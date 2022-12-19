package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.TheaterDTO;
import com.xworkz.crudhandling.exception.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO[] dtos = new TheaterDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(TheaterDTO dto) {
		if (this.currentIndex >= this.dtos.length) {
			System.err.println("Theater Size is exceeded");
			throw new StorageFullException("Bakery size exceeded ");
		}
		this.dtos[this.currentIndex] = dto;
		this.currentIndex++;

		return true;

	}

}
