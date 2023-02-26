package com.xworkz.trimmer.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.trimmer.entity.TrimmerEntity;

@Repository
public class TrimmerRepoImpl implements TrimmerRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public TrimmerRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(TrimmerEntity entity) {
		System.out.println("Running save in Repository");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();

		return false;
	}

	@Override
	public TrimmerEntity findById(int id) {
		System.out.println("Find by id in repo" + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		TrimmerEntity entity = manager.find(TrimmerEntity.class, id);
		manager.close();
		return entity;
	}

}
