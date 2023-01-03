package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streams.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> palaceDTOs = new ArrayList<PalaceDTO>();
		palaceDTOs.add(new PalaceDTO("Mysore Aramane", "Mysore", "Jayachamarajendra Vadeyar", false, 0));
		palaceDTOs.add(new PalaceDTO("Banglore Aramane", "Bengaluru", "HH Pramoda Vadeyar", true, 100));
		palaceDTOs.add(new PalaceDTO("Jaya Mahal", "Banglore", "Jagir", false, 50));
		palaceDTOs.add(new PalaceDTO("Ram bagh", "Jaipur", "Rambagh", true, 50));

		palaceDTOs.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));

	}

}
