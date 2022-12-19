package com.xworkz.crudopp.boot;

import java.time.LocalDateTime;

import com.xworkz.crudopp.constant.HelmetColor;
import com.xworkz.crudopp.constant.HelmetType;
import com.xworkz.crudopp.dto.HelmetDTO;
import com.xworkz.crudopp.repository.HelmetRepository;
import com.xworkz.crudopp.repository.HelmetRepositoryImpli;
import com.xworkz.crudopp.service.HelmetService;
import com.xworkz.crudopp.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO helmetDto = new HelmetDTO();
		helmetDto.setCompany("Wrangler");
		helmetDto.setColor(HelmetColor.MILITARY);
		helmetDto.setPrice(956);
		helmetDto.setType(HelmetType.MILITARY);
		helmetDto.setCreatedBy("Srisham");
		helmetDto.setCreatedDate(LocalDateTime.now());
		helmetDto.setUpdatedBy("SYSTEM");
		helmetDto.setUpdatedDate(LocalDateTime.now());

		HelmetRepository repository = new HelmetRepositoryImpli();
		HelmetService helmetService = new HelmetServiceImpl(repository);
		boolean success = helmetService.validateAndSave(helmetDto);
		System.out.println("Success" + success);

	}

}
