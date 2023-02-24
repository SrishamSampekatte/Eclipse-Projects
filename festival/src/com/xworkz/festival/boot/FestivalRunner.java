package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {

	public static void main(String[] args) {
		System.out.println("Inserting data into database");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		FestivalEntity entity1 = new FestivalEntity("Sankranti", "Kerala", 1, "Pongal", "Ayyappa Swamy");
		FestivalEntity entity2 = new FestivalEntity("MahaShivaratri", "AllIndia", 1, "Kjjaya", "Shiva");
		FestivalEntity entity3 = new FestivalEntity("Holi", "North India", 1, "Baang", "Kaaman");
		FestivalEntity entity4 = new FestivalEntity("Buddha Jayanti", "North East", 1, "laddu", "Budha");
		FestivalEntity entity5 = new FestivalEntity("Eid Ul Fitur", "AllIndia", 1, "Biriyani", "Allah");
		FestivalEntity entity6 = new FestivalEntity("RakshaBandan", "India", 1, "Chocolate", "BigBrother");
		FestivalEntity entity7 = new FestivalEntity("Janmastami", "SouthIndia", 1, "Akki Payasa", "SriKrishna");
		FestivalEntity entity8 = new FestivalEntity("Ugadi", "India", 1, "BevuBella", "Surya");
		FestivalEntity entity9 = new FestivalEntity("IndipendenceDay", "AllIndia", 1, "candy", "Gandhi");
		FestivalEntity entity10 = new FestivalEntity("Onam", "Kerala", 10, "Pongal", "Vishnu");
		FestivalEntity entity11 = new FestivalEntity("Kola", "Karnataka", 2, "Payasa", "Vamana");
		FestivalEntity entity12 = new FestivalEntity("Vishu", "Kerala", 2, "laddu", "Krishna");
		FestivalEntity entity13 = new FestivalEntity("Ganesha Chaturthi", "AllIndia", 1, "Kadubu", "Ganesha");
		FestivalEntity entity14 = new FestivalEntity("Vara Mahalaxi", "Karnataka", 1, "KobbariMitayi", "Laxmi");
		FestivalEntity entity15 = new FestivalEntity("Navaratri", "WestBengal", 9, "NineSweets", "Durga");
		FestivalEntity entity16 = new FestivalEntity("Dussera", "Karnataka", 1, "Kesaribat", "Durgamata");
		FestivalEntity entity17 = new FestivalEntity("Deepavali", "India", 3, "ThreeSweet", "Bhoota");
		FestivalEntity entity18 = new FestivalEntity("NagaPanchami", "Karnataka", 1, "Tambittu", "Nagaraja");
		FestivalEntity entity19 = new FestivalEntity("Chritsmus", "AllIndia", 1, "Cake", "Yesu");
		FestivalEntity entity20 = new FestivalEntity("Saga Dawa", "Sikkim", 2, "bundi", "budda");
		FestivalEntity entity21 = new FestivalEntity("Moatsu Mong", "Nagaland", 2, "RiceSweet", "sowing season");
		FestivalEntity entity22 = new FestivalEntity("Hemis", "Ladakh", 1, "pana", "Padmasambhava");
		FestivalEntity entity23 = new FestivalEntity("Chhath Puja", "Jharkhand", 1, "bundi", "sun");
		FestivalEntity entity24 = new FestivalEntity("Gangaur", " Telangana", 1, "champakali", "shiva");
		FestivalEntity entity25 = new FestivalEntity("gowri", "mumbai", 1, "vabathu", "gowri");

		transaction.begin();
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		manager.persist(entity25);
		transaction.commit();
	}

}
