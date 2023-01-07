package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Road ref = spring.getBean(Road.class);

		ref.setLocation("Blore");
		ref.setRoadName("MG Road");
		System.out.println(ref);

		System.out.println(" ");
		System.out.println(" Creating instances of Cycle ");
		Cycle ref2 = spring.getBean(Cycle.class);
		System.out.println(ref2);

		System.out.println(" ");
		System.out.println(" Creating instances of Girl ");
		Girl ref3 = spring.getBean(Girl.class);
		ref3.setName(" Anusha");
		ref3.setDegree("B E");
		System.out.println(ref3);

		System.out.println(" ");
		System.out.println(" Creating instances of Milk ");
		Milk ref4 = spring.getBean(Milk.class);
		ref4.setColor("White");
		ref4.setSource("Cow");
		System.out.println(ref4);

		System.out.println(" ");
		System.out.println(" Creating instances of Mask");
		Mask ref5 = spring.getBean(Mask.class);
		ref5.setName("N 95");
		ref5.setColor("Blue");
		System.out.println(ref5);

		System.out.println(" ");
		System.out.println(" Creating instances of Patient");
		Patient ref6 = spring.getBean(Patient.class);
		ref6.setName("Laden");
		ref6.setDesease("Religious Blind ness");
		System.out.println(ref6);

		System.out.println(" ");
		System.out.println(" Creating instances of Chocolate");
		Chocolate ref7 = spring.getBean(Chocolate.class);
		ref7.setName("Temptation");
		ref7.setColor("Cofee");
		System.out.println(ref7);

		System.out.println(" ");
		System.out.println(" Creating instances of Area");
		Area ref8 = spring.getBean(Area.class);
		ref8.setName("Rajaji");
		ref8.setState("Karnataka");
		System.out.println(ref8);

		System.out.println(" ");
		System.out.println(" Creating instances of City");
		City ref9 = spring.getBean(City.class);
		ref8.setName("Blore");
		ref8.setState("Karnataka");
		System.out.println(ref9);

		System.out.println(" ");
		System.out.println(" Creating instances of Fish");
		Fish ref10 = spring.getBean(Fish.class);
		ref10.setName("Fish");
		ref10.setSize('B');
		System.out.println(ref10);

		System.out.println(" ");
		System.out.println(" Creating instances of Temple");
		Temple ref11 = spring.getBean(Temple.class);
		ref11.setName("Shambulingeshwara");
		ref11.setFavt(true);
		System.out.println(ref11);

		System.out.println(" ");
		System.out.println(" Creating instances of God");
		God ref12 = spring.getBean(God.class);
		ref12.setName("Shambulingeshwara");
		ref12.setPowefull(" true");
		System.out.println(ref12);

		System.out.println(" ");
		System.out.println(" Creating instances of Park ");
		Park ref13 = spring.getBean(Park.class);
		System.out.println(ref13);

		System.out.println(" ");
		System.out.println(" Creating instances of Mall ");
		Mall ref14 = spring.getBean(Mall.class);
		System.out.println(ref14);

		System.out.println(" ");
		System.out.println(" Creating instances of Application ");
		Application ref15 = spring.getBean(Application.class);
		System.out.println(ref15);

	}

}
