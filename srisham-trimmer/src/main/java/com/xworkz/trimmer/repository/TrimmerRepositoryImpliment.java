package com.xworkz.trimmer.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.trimmer.entity.TrimmerEntity;

@Repository
public class TrimmerRepositoryImpliment implements TrimmerRepository {

	public TrimmerRepositoryImpliment() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(TrimmerEntity entity) {
		System.out.println("Running Save method in TrimmerEntity manager Repository");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(entity);
			entityTransaction.commit();
			return true;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public TrimmerEntity findById(int id) {
		System.out.println("Find By id in repo" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		TrimmerEntity entity = entityManager.find(TrimmerEntity.class, id);
		return entity;
	}

}
