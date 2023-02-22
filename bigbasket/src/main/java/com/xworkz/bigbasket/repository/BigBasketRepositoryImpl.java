package com.xworkz.bigbasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.bigbasket.entity.BigBasketEntity;

public class BigBasketRepositoryImpl implements BigBasketRepository {
	@Autowired
	private EntityManagerFactory entityMangaerFactory;

	public BigBasketRepositoryImpl() {
		System.out.println("running Big basket repo ");
	}

	@Override
	public boolean save(BigBasketEntity basketEntity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityMangaerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(basketEntity);
		et.commit();
		em.close();
		return true;

	}

}
