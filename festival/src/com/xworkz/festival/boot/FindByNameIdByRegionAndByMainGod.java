package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByNameIdByRegionAndByMainGod {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameIdByRegionAndByMainGod");
		query .setParameter("nameby", "Dussera");
		query .setParameter("regionby", "Karnataka");
		query .setParameter("maingodby", "Durgamata");

		FestivalEntity entity=(FestivalEntity) query.getSingleResult();
		System.out.println(entity);

		manager.close();

	}

}
