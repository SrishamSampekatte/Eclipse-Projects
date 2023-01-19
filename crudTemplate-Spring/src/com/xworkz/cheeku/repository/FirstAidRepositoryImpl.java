package com.xworkz.cheeku.repository;

import org.springframework.stereotype.Component;

import com.xworkz.cheeku.dto.FirstAidDTO;

@Component
public class FirstAidRepositoryImpl implements FirstAidRepository {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save in repo ");
		System.out.println(dto);
		return true;
	}

}
