package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDto;

@Repository
public class EggRepositoryImpl implements EggRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public EggRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDto eggDto) {
		System.out.println("running save in egg repo...");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(eggDto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}