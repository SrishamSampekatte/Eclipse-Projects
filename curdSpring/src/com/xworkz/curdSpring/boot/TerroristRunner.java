package com.xworkz.curdSpring.boot;

import com.xworkz.curdSpring.dto.TerroristDTO;
import com.xworkz.curdSpring.service.TerroristService;
import com.xworkz.curdSpring.service.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO();
	 dto.setName("Anusaa");
	 dto.setAge(29);
		System.out.println(dto);

		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(dto);
	}

}
