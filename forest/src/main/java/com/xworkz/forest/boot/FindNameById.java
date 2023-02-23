package main.java.com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.forest.entity.ForestEntity;

public class FindNameById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindNameById");
		Object obj = query.getSingleResult();
		ForestEntity entity = (ForestEntity) obj;
		System.out.println(entity);
		manager.close();

	}

}
