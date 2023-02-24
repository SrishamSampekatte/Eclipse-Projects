package main.java.com.xworkz.forest.boot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.forest.entity.ForestEntity;

public class FindByNameAndStateAndArea {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndStateAndArea");
		Object obj = query.getResultList();
		List entity = (List) obj;
		System.out.println(entity);
		manager.close();

	}

}
