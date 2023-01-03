package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streams.dto.DataBaseVendorDTO;
import com.xworkz.streams.dto.Type;

public class DataBaseVendorRunner {

	public static void main(String[] args) {
		Collection<DataBaseVendorDTO> dataBaseVendor = new ArrayList<DataBaseVendorDTO>();

		dataBaseVendor.add(new DataBaseVendorDTO("Oracle DataBase ", "Oracle", Type.ORACLE, 34.8, 1300.65));
		dataBaseVendor.add(new DataBaseVendorDTO("Sql DataBase ", "Sql", Type.MYSQL, 54.8, 869));
		dataBaseVendor.add(new DataBaseVendorDTO("IBM DataBase ", "IBM", Type.NOSQL, 87, 68));

		System.out.println("Convert developed by to uppercase and print all the names ");

		dataBaseVendor
		.stream()
		//.filter(dto -> dto.getDevelopedBy())
		.map(dto -> dto.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach (e -> System.out.println(e));
		
		System.out.println(" Licence cost less than 100 and printing types ");
		
		dataBaseVendor
		.stream()
		.filter(dto -> dto.getLicenceCost()< 100)
		//.map(dto -> dto.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach (dto-> System.out.println(dto.getType()));
		
		System.out.println(" ");
		System.out.println("Printing vendor types");
		dataBaseVendor
		.stream()
		//.filter(dto -> dto.getType())
		//.map(dto -> dto.getDevelopedBy().toUpperCase())
		//.collect(Collectors.toList())
		.forEach (dto-> System.out.println(dto.getType()));
		
		
		
		
		
	}

}
