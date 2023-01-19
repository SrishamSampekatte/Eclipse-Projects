package com.xworkz.cheeku.repository;

import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.ResortDTO;
@Component
public class ResortRepositoryImpl implements ResortRepository {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save method in Repo..");
		System.out.println(dto);
		return true;
	}

}
