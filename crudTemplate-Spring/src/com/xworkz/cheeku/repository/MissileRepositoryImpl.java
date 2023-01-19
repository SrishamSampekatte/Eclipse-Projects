package com.xworkz.cheeku.repository;

import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.MissileDTO;

@Component
public class MissileRepositoryImpl implements MissileRepository {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running save in repo ");
		System.out.println(dto);
		return true;
	}

}
