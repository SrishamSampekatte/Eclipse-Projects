package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streams.dto.CompanyCEODto;
import com.xworkz.streams.dto.DaughterDto;

public class CompanyRunner {

	public static void main(String[] args) {
		Collection<CompanyCEODto> ceoDtos=new ArrayList<CompanyCEODto>();
		DaughterDto daughterDto1=new DaughterDto("Disha", 8277738399L, 21, false, true);
		DaughterDto daughterDto2=new DaughterDto("Kendle ", 8277738399L, 22, false, true);
		DaughterDto daughterDto3=new DaughterDto("Sia", 7349021513L, 23, false, true);
		DaughterDto daughterDto4=new DaughterDto("Shakhiraa", 8277738399L, 24, false, true);
		DaughterDto daughterDto5=new DaughterDto("Inna", 8277738399L, 25, false, true);
		ceoDtos.add(new CompanyCEODto("Rathan", "tcs", 80, "India", "mba", false, daughterDto1));
		ceoDtos.add(new CompanyCEODto("Narayan Murthy", "Infosys", 70, "India", "Bba", true, daughterDto2));
		ceoDtos.add(new CompanyCEODto("Anand Mahindra", "Mahanidra", 65, "India", "Bbm", true, daughterDto3));
		ceoDtos.add(new CompanyCEODto("Azeem Premji", "Wipro", 75, "indus", "bcom", true, daughterDto4));
		ceoDtos.add(new CompanyCEODto("Ambani and Son", "Reliance", 67, "Mumbai", "Mcom", true, daughterDto5));

		ceoDtos.stream()
		.map(dto->dto.getDaughterDto())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto.getName()));
		
		System.out.println(" ");
		
		ceoDtos.stream()
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(" ");
		
		
		ceoDtos.stream()
		.filter(dto->dto.getAge()>70)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(" ");
		ceoDtos.stream()
		.forEach(dto->System.out.println("father age : "+dto.getAge() + " & "  +"daughter age : "+dto.getDaughterDto().getAge()));

	}

	}

}
