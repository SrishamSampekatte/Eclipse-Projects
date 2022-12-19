package com.xworkz.crudopp.repository;

import com.xworkz.crudopp.dto.HelmetDTO;

public class HelmetRepositoryImpli implements HelmetRepository {
	private HelmetDTO[] dtos = new HelmetDTO[5];
	private int currentInex = 0;

	@Override
	public boolean save(HelmetDTO dto) {
		if (this.currentInex >= this.dtos.length) {
			System.err.println(" Storage is full");
			return false;
		}
		this.dtos[this.currentInex] = dto;
		this.currentInex++;

		return true;
	}

}
