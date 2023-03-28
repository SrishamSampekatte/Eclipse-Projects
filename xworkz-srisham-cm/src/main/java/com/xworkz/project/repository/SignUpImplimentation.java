package com.xworkz.project.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.SignUpEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SignUpImplimentation implements SignUpRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(SignUpEntity signUpEntity) {

		log.info("Running save in Repository");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(signUpEntity);
		transaction.commit();
		manager.close();
		return false;
	}
}
