package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {
	@Autowired
	private EggRepository eggRepository;

	public EggServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDto EggDto) {
		System.out.println("running validate and save in EggService");
		boolean saved = this.eggRepository.save(EggDto);
		System.out.println("Saved in service " + saved);
		return false;
	}

}
