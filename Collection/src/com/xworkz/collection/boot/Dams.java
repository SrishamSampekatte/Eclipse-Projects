package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {

	public static void main(String[] args) {
		Collection<String> karnataka = new ArrayList<String>();
		karnataka.add("Tunga Bhadra Dam");
		karnataka.add("Linganmakki Dam");
		karnataka.add("Kadra Dam");
		karnataka.add("Kadra Dam");
		karnataka.add("Almatti Dam");
		karnataka.add("Supa Dam");
		karnataka.add("Krishna Raja Sagara Dam");
		karnataka.add("Harangi Dam");
		karnataka.add("Narayanpura Dam");
		karnataka.add("Kodasalli Dam");

		System.out.println("No of dams in Karnataka" + karnataka.size());

		Collection<String> telangana = new ArrayList<String>();
		telangana.add("Nizam Sagar Dam");
		telangana.add("Singur Dam");
		telangana.add("Radhanagari Dam");
		telangana.add("Lower Manair Dam");
		telangana.add("Mid Manair Dam");
		telangana.add("Upper Manair Dam");
		System.out.println("No of dams in Telangana" + telangana.size());

		Collection<String> andraPradesh = new ArrayList<String>();
		andraPradesh.add("Samasila Dam");
		andraPradesh.add("Srisailam Dam");
		System.out.println("No of dams in Andra Pradesh" + andraPradesh.size());

		Collection<String> gujarat = new ArrayList<String>();
		gujarat.add("Ukai Dam");
		gujarat.add("Dharoi Dam");
		gujarat.add("Kadana Dam");
		System.out.println("No of dams in Gujarath" + gujarat.size());

		Collection<String> himachalPradesh = new ArrayList<String>();
		himachalPradesh.add("Pandoh Dam");
		himachalPradesh.add("Bhakra Nangal Dam");
		himachalPradesh.add("Chamera Dam");
		himachalPradesh.add("Nathpa Jhakri Dam");
		System.out.println("No of dams in Himachal Pradesh" + himachalPradesh.size());

		Collection<String> jammuAndKashmir = new ArrayList<String>();
		jammuAndKashmir.add("Baglihar Dam");
		jammuAndKashmir.add("Dumkhar Hydroelectric Dam");
		jammuAndKashmir.add("Uri Hydroelectric Dam");
		System.out.println("No of dams in Jammu and Kashmir" + jammuAndKashmir.size());

		Collection<String> jharkhand = new ArrayList<String>();
		jharkhand.add("Maithon Dam");
		jharkhand.add("Chandil Dam");
		jharkhand.add("Maithon Dam");
		System.out.println("No of dams in Jharkand" + jharkhand.size());

		Collection<String> kerala = new ArrayList<String>();
		kerala.add("Malampuzha Dam");
		kerala.add("Peechi Dam");
		kerala.add("Kundala Dam");
		kerala.add("Parambikulam Dam");
		kerala.add("Walayar Dam");
		System.out.println("No of dams in Kerala" + kerala.size());

		Collection<String> madhyaPradesh = new ArrayList<String>();
		madhyaPradesh.add("Barna Dam");
		madhyaPradesh.add("Bargi Dam");
		madhyaPradesh.add("Bansagar Dam");
		System.out.println("No of dams in Madhya Pradesh" + madhyaPradesh.size());

		Collection<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Yeldari Dam");
		maharashtra.add("Ujani Dam");
		maharashtra.add("Pawna Dam");
		maharashtra.add("Mulshi Dam");
		maharashtra.add("Koyna Dam");
		maharashtra.add("Jayakwadi Dam");
		maharashtra.add("Bhatsa Dam");
		maharashtra.add("Wilson Dam");
		maharashtra.add("Tansa Dam");
		maharashtra.add("Panshet Dam");
		maharashtra.add("Mula Dam");
		maharashtra.add("Kolkewadi Dam");
		maharashtra.add("Vaitarna Dam");
		maharashtra.add("Girna Dam");
		System.out.println("No of dams in Maharashtra" + maharashtra.size());

		Collection<String> odisha = new ArrayList<String>();
		odisha.add("Jalaput Dam");
		odisha.add("Indravati Dam");
		odisha.add("Hirakud Dam");
		System.out.println("No of dams in Odisha" + odisha.size());

		Collection<String> tamilNadu = new ArrayList<String>();
		tamilNadu.add("Mettur Dam");
		tamilNadu.add("Perunachani Dam");
		tamilNadu.add("Vaigai Dam ");
		System.out.println("No of dams in Tamil Nadu" + tamilNadu.size());

		Collection<String> uttarakhand = new ArrayList<String>();
		uttarakhand.add("Tehri Dam");
		uttarakhand.add("Perunachani Dam");
		System.out.println("No of dams in Uttara Khand" + uttarakhand.size());

		Collection<String> goa = new ArrayList<String>();
		goa.add("Anjunam Dam");
		goa.add("Mi Dam");
		goa.add("Salaum Dam");
		System.out.println("No of dams in goa: " + goa.size());

		Collection<String> meghalaya = new ArrayList<String>();
		meghalaya.add("Khandong  Dam");
		meghalaya.add("Umiam St-iii Dam");
		meghalaya.add("Mawphlang Dam");
		meghalaya.add("Myntdu-Leshka Dam");
		meghalaya.add("Nongkhyllem  Dam");
		System.out.println("No of dams in Meghalaya:" + meghalaya.size());

		System.out.println(" Dams in India ");

		Collection<String> damsInIndia = new ArrayList<String>();
		damsOfIndia.addAll(karnataka);
		damsOfIndia.addAll(telangana);
		damsOfIndia.addAll(andraPradesh);
		damsOfIndia.addAll(gujarat);
		damsOfIndia.addAll(himachalPradesh);
		damsOfIndia.addAll(jammuAndKashmir);
		damsOfIndia.addAll(jharkhand);
		damsOfIndia.addAll(kerala);
		damsOfIndia.addAll(madhyaPradesh);
		damsOfIndia.addAll(maharashtra);
		damsOfIndia.addAll(odisha);
		damsOfIndia.addAll(tamilNadu);
		damsOfIndia.addAll(uttarakhand);
		damsOfIndia.addAll(goa);
		damsOfIndia.addAll(meghalaya);
		System.out.println("No of dams in India " + damsOfIndia.size());

		Iterator<String> element = damsOfIndia.iterator();
		while (element.hasNext()) {
			String dams = element.next();
			if (dams.startsWith("T")) {
				System.out.println("Dams Starting with T: " + dams);
			}
		}

		Iterator<String> element2 = damsOfIndia.iterator();
		while (element2.hasNext()) {
			String dams = element2.next();
			if (dams.endsWith("ra")) {
				System.out.println("Dams ends with ra: " + dams);
			}
		}

		Iterator<String> element3 = damsOfIndia.iterator();
		while (element3.hasNext()) {
			String dams = element3.next();
			if (dams.length() > 15) {
				System.out.println("Dams length having greater than 15 : " + dams);
			}
		}

		Iterator<String> element4 = damsOfIndia.iterator();
		while (element4.hasNext()) {
			String dams = element4.next();
			System.out.println(dams.toUpperCase());
			System.out.println(dams.toLowerCase());

		}
		Iterator<String> element5 = damsOfIndia.iterator();
		while (element5.hasNext()) {
			String dams = element5.next();
			String rev = "";
			for (int i = dams.length() - 1; i >= 0; i--) {
				rev = rev + dams.charAt(i);
			}
			if (rev.equalsIgnoreCase(dams)) {
				System.out.println("Element is palindrome");
			} else {
				System.out.println("Element is not palindrome");
			}
		}

		System.out.println("Indian dams before remove " + damsOfIndia.size());
		Iterator<String> element6 = damsOfIndia.iterator();
		while (element6.hasNext()) {
			String dams = element6.next();
			if (dams.contains("p")) {
				element6.remove();
			}
		}
		System.out.println("Indian dams after  remove " + damsOfIndia.size());

	}

}
