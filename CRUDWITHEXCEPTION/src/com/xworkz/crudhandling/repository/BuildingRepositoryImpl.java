package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.BuildingDTO;
import com.xworkz.crudhandling.exception.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] dtos = new BuildingDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(BuildingDTO dto) {
		if (this.currentIndex >= this.dtos.length) {
			System.err.println("Buildinng size exceeded");
			throw new StorageFullException("No of Building exceeded");
		}
		this.dtos[currentIndex] = dto;
		this.currentIndex++;
		return true;
	}
}
