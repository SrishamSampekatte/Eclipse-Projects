package com.xworkz.template.repository;

import com.xworkz.template.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	public SoldierRepoImpl() {
		System.out.println("Craeted SoldierRepoImpl using no arg constructor..");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO" + dto);
		return false;
	}

}
