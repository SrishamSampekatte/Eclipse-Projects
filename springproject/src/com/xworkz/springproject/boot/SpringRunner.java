package com.xworkz.springproject.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springproject.configuration.SpringConfiguration;

public class SpringRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beansName = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beansName));
		String refofString1 = spring.getBean("name", String.class);
		String refofString2 = spring.getBean("location", String.class);
		String refofString3 = spring.getBean("ingredients", String.class);
		String refofString4 = spring.getBean("company", String.class);
		String refofString5 = spring.getBean("owner", String.class);

		System.out.println(refofString1.hashCode());
		System.out.println(refofString2.hashCode());
		System.out.println(refofString3.hashCode());
		System.out.println(refofString4.hashCode());
		System.out.println(refofString5.hashCode());

		System.out.println("===================================================================");

		boolean ref1 = spring.getBean("isBigCompany", boolean.class);
		boolean ref2 = spring.getBean("isOldCompany", boolean.class);
		boolean ref3 = spring.getBean("isFamous", boolean.class);
		boolean ref4 = spring.getBean("isRunningProfit", boolean.class);
		boolean ref5 = spring.getBean("companyIsSuccesfull", boolean.class);

		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println(ref4);
		System.out.println(ref5);
		// System.out.println(ref.hashCode());

		System.out.println(" ===========================================================");
		Double refe1 = spring.getBean("companyProducts", Double.class);
		Double refe2 = spring.getBean("companyIncome", Double.class);
		Double refe3 = spring.getBean("productsHighestPrice", Double.class);
		Double refe4 = spring.getBean("productsLeastPrice", Double.class);
		Double refe5 = spring.getBean("tax", Double.class);

		System.out.println(refe1);
		System.out.println(refe2);
		System.out.println(refe3);
		System.out.println(refe4);
		System.out.println(refe5);
		System.out.println(" ======================================================");

		StringBuffer buf1 = spring.getBean("buffName", StringBuffer.class);
		StringBuffer buf2 = spring.getBean("buffBrandName", StringBuffer.class);
		StringBuffer buf3 = spring.getBean("buffCompanyFirstName", StringBuffer.class);
		StringBuffer buf4 = spring.getBean("buffOwnerLastName", StringBuffer.class);
		StringBuffer buf5 = spring.getBean("buffLocation", StringBuffer.class);
		System.out.println(buf1);
		System.out.println(buf2);
		System.out.println(buf3);
		System.out.println(buf4);
		System.out.println(buf5);

		System.out.println("=======================================================");

		StringBuilder a = spring.getBean("companie", StringBuilder.class);
		StringBuilder b = spring.getBean("companyName", StringBuilder.class);
		StringBuilder c = spring.getBean("brandName", StringBuilder.class);
		StringBuilder d = spring.getBean("ownerFirstName", StringBuilder.class);
		StringBuilder e = spring.getBean("ownerLastName", StringBuilder.class);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		System.out.println("======================================================");

		List<Integer> list = spring.getBean("arrayListValues", ArrayList.class);
		System.out.println(list);

		System.out.println("=====================================================");

		Map<String, Integer> map = spring.getBean("mapCityAndPincodes", Map.class);
		System.out.println(map);

	}

}
