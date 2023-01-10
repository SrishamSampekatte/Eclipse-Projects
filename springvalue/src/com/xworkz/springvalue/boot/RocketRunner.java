package com.xworkz.springvalue.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springvalue.configuration.SpringConfiguration;
import com.xworkz.springvalue.thing.Actor;
import com.xworkz.springvalue.thing.Rocket;
import com.xworkz.springvalue.thing.Season;

public class RocketRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket2 = container.getBean("pegasus", Rocket.class);

		System.out.println(refOfRocket2);
		refOfRocket2.setName("Pegasus");
		refOfRocket2.setCountry("USA");
		refOfRocket2.setBudget(456);
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getBudget());

		Rocket refOfRocket3 = container.getBean("aryabhata", Rocket.class);

		System.out.println(refOfRocket3);
		refOfRocket3.setName("Aryabhata");
		refOfRocket3.setCountry("India");
		refOfRocket3.setBudget(345);
		System.out.println(refOfRocket3.getName());
		System.out.println(refOfRocket3.getCountry());
		System.out.println(refOfRocket3.getBudget());

		Rocket refOfRocket4 = container.getBean("insat", Rocket.class);

		System.out.println(refOfRocket4);
		refOfRocket4.setName("Insat");
		refOfRocket4.setCountry("India");
		refOfRocket4.setBudget(785);
		System.out.println(refOfRocket4.getName());
		System.out.println(refOfRocket4.getCountry());
		System.out.println(refOfRocket4.getBudget());

		Rocket refOfRocket5 = container.getBean("proton", Rocket.class);

		System.out.println(refOfRocket5);
		refOfRocket5.setName("Proton");
		refOfRocket5.setCountry("Russia");
		refOfRocket5.setBudget(895);
		System.out.println(refOfRocket5.getName());
		System.out.println(refOfRocket5.getCountry());
		System.out.println(refOfRocket5.getBudget());

		Rocket refOfRocket6 = container.getBean("reffel", Rocket.class);

		System.out.println(refOfRocket6);
		refOfRocket6.setName("Reffel");
		refOfRocket6.setCountry("France");
		refOfRocket6.setBudget(36);
		System.out.println(refOfRocket6.getName());
		System.out.println(refOfRocket6.getCountry());
		System.out.println(refOfRocket6.getBudget());

		System.out.println(" ===================================================");

		Actor refOfActor = container.getBean("actor", Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLang());
		System.out.println(refOfActor.getAge());

		Actor refOfActor1 = container.getBean("cruise", Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLang());
		System.out.println(refOfActor1.getAge());

		Actor refOfActor2 = container.getBean("cruise", Actor.class);
		System.out.println(refOfActor2);
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getLang());
		System.out.println(refOfActor2.getAge());

		Actor refOfActor3 = container.getBean("rock", Actor.class);
		System.out.println(refOfActor3);
		System.out.println(refOfActor3.getName());
		System.out.println(refOfActor3.getLang());
		System.out.println(refOfActor3.getAge());

		Actor refOfActor4 = container.getBean("yash", Actor.class);
		System.out.println(refOfActor4);
		System.out.println(refOfActor4.getName());
		System.out.println(refOfActor4.getLang());
		System.out.println(refOfActor4.getAge());

		Actor refOfActor5 = container.getBean("appu", Actor.class);
		System.out.println(refOfActor5);
		System.out.println(refOfActor5.getName());
		System.out.println(refOfActor5.getLang());
		System.out.println(refOfActor5.getAge());

		System.out.println("===============================================");
		Season refOfSeason = container.getBean("season", Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMonth());
		System.out.println(refOfSeason.getDuration());

		Season refOfSeason2 = container.getBean("summer", Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartingMonth());
		System.out.println(refOfSeason2.getDuration());

		Season refOfSeason3 = container.getBean("rainy", Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartingMonth());
		System.out.println(refOfSeason2.getDuration());

		Season refOfSeason4 = container.getBean("automn", Season.class);
		System.out.println(refOfSeason4);
		System.out.println(refOfSeason4.getName());
		System.out.println(refOfSeason4.getStartingMonth());
		System.out.println(refOfSeason4.getDuration());

	}

}
