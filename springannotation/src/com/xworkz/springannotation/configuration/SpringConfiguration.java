package com.xworkz.springannotation.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springannotation")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created Spring configuration ");
	}

	@Bean
	public int id() {
		System.out.println("Registering id ");
		int ref = new Integer("1");
		return ref;
	}

	@Bean
	public String name() {
		System.out.println("Regestering name");
		String ref = new String("Master Agencies");
		return ref;
	}

	@Bean
	public String gstNo() {
		System.out.println("Regestering gst ");
		String ref = new String("Master123");
		return ref;
	}

	@Bean
	public String owner() {
		System.out.println("Regestering owner ");
		String ref = new String("B G M");
		return ref;
	}

	@Bean
	public String address() {
		System.out.println("Regestering Address");
		String ref = new String("Sampekatte");
		return ref;
	}

	public static void seperator() {
		System.out.println("=====================");
	}

	@Bean
	public String nameOfSoftware() {
		System.out.println("Regestering Software");
		String ref = new String("Travelling app");
		return ref;
	}

	@Bean
	public double salery() {
		System.out.println("Regestering Salery");
		double ref = new Double(6754879);
		return ref;
	}

	@Bean
	public String developer() {
		System.out.println("Regestering Developer");
		String ref = new String("Srisham");
		return ref;
	}
	// @Bean
	// public LocalDate date() {
	// System.out.println("Regestering date");
	// LocalDate ref = new LocalDate(LocalDate);
	// return ref;
	// }

	@Bean
	public boolean free() {
		System.out.println("Regestering Developer");
		boolean ref = new Boolean(true);
		return ref;
	}

	public static void seperato() {
		System.out.println("=====================");
	}

	@Bean
	public String nameofSE() {
		System.out.println("Regestering name of SE");
		String ref = new String("Srisham ");
		return ref;
	}

	@Bean
	public double saleryOfSE() {
		System.out.println("Regestering Salery");
		double ref = new Double(67548);
		return ref;
	}

	@Bean
	public String companyofSE() {
		System.out.println("Regestering name of company");
		String ref = new String("Google");
		return ref;
	}

	@Bean
	public double expOfSE() {
		System.out.println("Regestering Experience");
		double ref = new Double(2.5);
		return ref;
	}

	public static void pencilSeperator() {
		System.out.println("=====================");
	}

	@Bean
	public String nameOfPencil() {
		System.out.println("Regestering name of Pencil");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String typeOfPencil() {
		System.out.println("Regestering name of Pencil");
		String ref = new String("Led");
		return ref;
	}

	@Bean
	public double priceOfPencil() {
		System.out.println("Regestering Price of Pencil");
		double ref = new Double(5);
		return ref;
	}

	@Bean
	public String colorOfPencil() {
		System.out.println("Regestering color of Pencil");
		String ref = new String("Gray");
		return ref;
	}

	@Bean
	public boolean sharpnessOfPencil() {
		System.out.println("Regestering Sharpness");
		boolean ref = new Boolean(true);
		return ref;
	}

	@Bean
	public boolean stolenPencil() {
		System.out.println("Kaddidda?");
		boolean ref = new Boolean(false);
		return ref;
	}

	public static void RubberSeperator() {
		System.out.println("=====================");
	}

	@Bean
	public String nameOfRubber() {
		System.out.println("Regestering name of Rubber");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String typeOfRubber() {
		System.out.println("Regestering Type of Rubber");
		String ref = new String("Rubber");
		return ref;
	}

	@Bean
	public double priceOfRubber() {
		System.out.println("Regestering Price of Rubber");
		double ref = new Double(5);
		return ref;
	}

	@Bean
	public String colorOfRubber() {
		System.out.println("Regestering color of Rubber");
		String ref = new String("White");
		return ref;
	}

	@Bean
	public String shapeOfRubber() {
		System.out.println("Regestering shape pf Rubber");
		String ref = new String("Square");
		return ref;
	}

	@Bean
	public boolean stolenRubber() {
		System.out.println("Kaddidda?");
		boolean ref = new Boolean(false);
		return ref;
	}

	@Bean
	public char sizeOfRubber() {
		System.out.println("Kaddidda?");
		char ref = new Character('M');
		return ref;
	}

	public static void myWishSeperator() {
		System.out.println("=====================");
	}

	@Bean
	public String myName() {
		System.out.println("Regestering name of Me");
		String ref = new String("Srisham");
		return ref;
	}

	@Bean
	public byte myAge() {
		System.out.println("Regestering age of Me");

		return 99;
	}

	@Bean
	public short myHeight() {
		System.out.println("Regestering height of Me");
		//short ref = new Short((short) 99);
		return 175;
	}

	@Bean
	public int myPinCode() {
		System.out.println("Regestering pincode of Me");
		int ref = new Integer(577452);
		return ref;
	}

	@Bean
	public long myMobileNo() {
		System.out.println("Regestering mobile Number of Me");
		long ref = new Long(8277738399l);
		return ref;
	}

	@Bean
	public float myWeight() {
		System.out.println("Regestering weight of Me");
		float ref = new Float(67.8f);
		return ref;
	}

	@Bean
	public double myPocketMoney() {
		System.out.println("Regestering pocket money of Me");
		double ref = new Double(0.0);
		return ref;
	}

	@Bean
	public char myShirtSize() {
		System.out.println("Regestering Shirt size of Me");
		char ref = new Character('M');
		return ref;
	}

	@Bean
	public boolean isCommitted() {
		System.out.println("Regestering Relationship of Me");
		boolean ref = new Boolean(false);
		return ref;
	}

	// @Bean
	// public LocalDate specialDte() {
	// System.out.println("Regestering Relationship of Me");
	// LocalDate ref = new LocalDate(LocalDate.of(1947,"", 0));
	// return ref;
	// }

}
