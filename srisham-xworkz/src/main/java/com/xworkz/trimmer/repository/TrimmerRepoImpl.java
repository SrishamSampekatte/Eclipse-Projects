package com.xworkz.trimmer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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

	@Override
	public List<TrimmerEntity> findByCompany(String company) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByCompany");
			query.setParameter("comp", company);
			System.out.println("query:" + query);
			List<TrimmerEntity> list = query.getResultList();
			System.out.println("Total list found in repo" + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connections");
		}
	}

}
