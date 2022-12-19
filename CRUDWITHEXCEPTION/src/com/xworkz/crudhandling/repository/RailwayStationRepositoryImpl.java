package com.xworkz.crudhandling.repository;

import com.xworkz.crudhandling.dto.RailwayStationDTO;
import com.xworkz.crudhandling.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO[] railData = new RailwayStationDTO[5];
	private int railNo = 0;

	@Override
	public boolean save(RailwayStationDTO dto) throws StorageFullException {
		if (this.railNo >= this.railData.length) {
			System.err.println("Railway size is exceeded ");
			throw new StorageFullException("Railway size exceeded");
		}

		this.railData[this.railNo] = dto;
		this.railNo++;
		return true;
	}
}
