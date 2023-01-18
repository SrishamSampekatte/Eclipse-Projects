package com.xworkz.template.boot;

import com.xworkz.template.dto.SoldierDTO;
import com.xworkz.template.repository.SoldierRepo;
import com.xworkz.template.repository.SoldierRepoImpl;
import com.xworkz.template.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO("Vikram ",7, "Punjab", "Punjab", "India");

		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}

}
