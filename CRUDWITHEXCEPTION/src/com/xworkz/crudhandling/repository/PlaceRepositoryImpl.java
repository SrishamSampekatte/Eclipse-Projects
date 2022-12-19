package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.PlaceDTO;
import com.xworkz.crudhandling.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {
	private PlaceDTO[] dtos=new PlaceDTO[5];
	private int currentIndex=0;

	@Override
	public boolean save(PlaceDTO dto) throws StorageFullException  {
		if(this.currentIndex>=this.dtos.length) {
			System.err.println("place exceeded");
			throw new StorageFullException("No of Place exceeded");
		}
		this.dtos[currentIndex]=dto;
		this.currentIndex++;
		return true;
	}

}
