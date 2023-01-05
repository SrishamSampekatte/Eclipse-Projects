package com.xworkz.streams.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streams.dto.WeaponDTO;
import com.xworkz.streams.dto.WeaponType;

public class WeaponRunner {

	public static void main(String[] args) {
		Collection<WeaponDTO> weaponDto = new ArrayList<WeaponDTO>();
		weaponDto.add(
				new WeaponDTO("AntiAircraft gun", "Raj", LocalDate.of(2022, 12, 15), 12764D, WeaponType.ARTILLERY));
		weaponDto.add(new WeaponDTO("Paris Gun", "Paris", LocalDate.of(2021, 11, 04), 45897D, WeaponType.ARTILLERY));
		weaponDto.add(
				new WeaponDTO("Ricin", "chemi", LocalDate.of(2000, 1, 18), 78958D, WeaponType.BIOLOGICAL_WEAPONRY));
		weaponDto.add(
				new WeaponDTO("Small pox", "medi", LocalDate.of(1980, 4, 19), 187958D, WeaponType.BIOLOGICAL_WEAPONRY));
		weaponDto.add(new WeaponDTO("Bola", "ranged", LocalDate.of(1990, 12, 28), 985D, WeaponType.COMBAT_WEAPONS));
		weaponDto.add(new WeaponDTO("Club", "handie", LocalDate.of(2022, 11, 21), 12764D, WeaponType.COMBAT_WEAPONS));
		weaponDto.add(new WeaponDTO("Daggar", "rax", LocalDate.of(1968, 1, 14), 12764D, WeaponType.COMBAT_WEAPONS));
		weaponDto.add(new WeaponDTO("Sword", "Raj", LocalDate.of(1258, 4, 15), 12764D, WeaponType.COMBAT_WEAPONS));
		weaponDto.add(new WeaponDTO("Mortar", "Raam", LocalDate.of(2018, 11, 9), 12764D, WeaponType.ARTILLERY));
		weaponDto.add(new WeaponDTO("Yellow rain", "shaaam", LocalDate.of(2022, 12, 8), 12764D,
				WeaponType.BIOLOGICAL_WEAPONRY));
		weaponDto.add(
				new WeaponDTO("Antiballistic mill", "Kiran", LocalDate.of(2000, 01, 2), 123D, WeaponType.MISSILES));
		weaponDto.add(new WeaponDTO("ICBM", "LIKKIT", LocalDate.of(2001, 01, 3), 987D, WeaponType.MISSILES));
		weaponDto.add(new WeaponDTO("LANCE MISSILE", "LAVANNA", LocalDate.of(2002, 01, 4), 876D, WeaponType.MISSILES));
		weaponDto.add(new WeaponDTO("V-2 MISSILE", "DEEKSHIT", LocalDate.of(2003, 01, 5), 6786D, WeaponType.MISSILES));
		weaponDto.add(new WeaponDTO("NIKE MISSILE", "MANU", LocalDate.of(2004, 01, 6), 7987D, WeaponType.MISSILES));
		weaponDto.add(new WeaponDTO("DEPTH CHARGE", "CHAITANYA", LocalDate.of(2005, 01, 7), 576D, WeaponType.BOMBS));
		weaponDto.add(new WeaponDTO("GRENADE", "BHOOM", LocalDate.of(2006, 01, 8), 1239D, WeaponType.BOMBS));
		weaponDto.add(new WeaponDTO("MINE", "NAVU", LocalDate.of(2007, 01, 9), 1230D, WeaponType.BOMBS));
		weaponDto.add(new WeaponDTO("PETN", "KRUTIK", LocalDate.of(2008, 01, 10), 1231D, WeaponType.BOMBS));
		weaponDto.add(new WeaponDTO("Rdx", "RAMAN", LocalDate.of(2009, 01, 11), 12312D, WeaponType.BOMBS));

		System.out.println("printing weapons Price grater than ");

		weaponDto.stream().filter((ele) -> ele.getPrice() > 6000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println(" ");
		System.out.println(" Print all made on ");
		weaponDto.stream().forEach(
				e -> System.out.println("Printing made by and made on" + e.getMadeBy() + " : " + e.getMadeOn()));

		System.out.println(" ");
		System.out.println("printing weapons name  by descending order ");

		weaponDto.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println(" ");
		System.out.println("printing weapons made by ascending order ");

		weaponDto.stream().sorted((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println(" ");
		System.out.println("printing weapons made on ascending order ");

		weaponDto.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println(" ");
		System.out.println("printing weapons price by ascending order ");

		weaponDto.stream().sorted((e1, e2) -> e1.getPrice().compareTo(e2.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println(" ");
		System.out.println("printing weapons price by descending order ");

		weaponDto.stream().sorted((e1, e2) -> e2.getPrice().compareTo(e1.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println(" ");
		System.out.println("printing weapons sort by madeon and name ascending order  ");

		weaponDto.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
				.forEach(e -> System.out.println("Printing name and made on " + e.getName() + " : " + e.getMadeOn()));

		System.out.println(" ");
		System.out.println("printing weapons sort by Type,madeBy and name ascending order  ");

		weaponDto.stream().sorted((e1, e2) -> e1.getType().compareTo(e2.getType()))
				.sorted((b1, b2) -> b1.getMadeBy().compareTo(b2.getMadeBy()))
				.sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.forEach(e -> System.out.println("Printing type  and made by and name  " + e.getType() + " : "
						+ e.getMadeBy() + " :" + e.getName()));

	}

}
