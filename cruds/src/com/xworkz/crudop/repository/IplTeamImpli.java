package com.xworkz.crudop.repository;

import com.xworkz.crudop.dto.IplDto;
import com.xworkz.crudop.exceptions.IplTeamSizeExceeedException;

public class IplTeamImpli implements IplRepository {

	private IplDto[] teams = new IplDto[10];
	private int currentIndex = 0;

	@Override
	public boolean iplTeam(IplDto dto) {
		System.out.println("Running the Ipl teams " + dto);
		if (this.currentIndex >= teams.length) {
			System.err.println("size exceeded");
			throw new IplTeamSizeExceeedException();
		}
		this.teams[this.currentIndex] = dto;
		currentIndex++;
		return false;
	}

	@Override
	public int total() {
		System.out.println("Running total");
		return this.currentIndex;

	}

}
