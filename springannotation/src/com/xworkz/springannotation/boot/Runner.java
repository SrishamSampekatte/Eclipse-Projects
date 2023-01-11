package com.xworkz.springannotation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springannotation.bean.HardwareShop;
import com.xworkz.springannotation.bean.MyWish;
import com.xworkz.springannotation.bean.Pencil;
import com.xworkz.springannotation.bean.Rubber;
import com.xworkz.springannotation.bean.Software;
import com.xworkz.springannotation.bean.SoftwareEngineer;
import com.xworkz.springannotation.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		System.out.println("=============");
		HardwareShop refOfHard = container.getBean(HardwareShop.class);
		System.out.println(refOfHard);

		System.out.println(" ===================== ");
		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware);

		System.out.println(" ===================== ");
		SoftwareEngineer refOfSoftwareE = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfSoftwareE);

		System.out.println(" ===================== ");
		Pencil pencil = container.getBean(Pencil.class);
		System.out.println(pencil);

		System.out.println(" ===================== ");
		Rubber rubber = container.getBean(Rubber.class);
		System.out.println(rubber);

		System.out.println(" ===================== ");
		MyWish wish = container.getBean(MyWish.class);
		System.out.println(wish);

	}

}
