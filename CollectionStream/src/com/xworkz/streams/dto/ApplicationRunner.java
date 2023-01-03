package com.xworkz.streams.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> applicationDTO = new ArrayList<ApplicationDTO>();
		applicationDTO.add(new ApplicationDTO("Youtube", 2.8, true, "Google", 0));
		applicationDTO.add(new ApplicationDTO("Chrome Browser", 4.0, false, "Googlee", 0));
		applicationDTO.add(new ApplicationDTO("Edge", 6.0, false, "MicroSoft", 68));
		applicationDTO.add(new ApplicationDTO("Text to Speech", 1.0, false, "Kushbu", 2000));

		System.out.println("Which is free and developed by Google");

		applicationDTO
		.stream()
		.filter(dto -> dto.isFree())
		.filter(dto -> dto.getDevelopedBy()
		.contains("Google"))
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));

		System.out.println(" ");
		System.out.println("version greater than 5 and collect only names ");
		
		applicationDTO
		.stream()
		.filter(dto -> dto.getVersion() > 5)
		.collect(Collectors.toList())
	    .forEach(dto -> System.out.println(dto.getName()));
		
		System.out.println(" ");
		System.out.println();

	}

}
