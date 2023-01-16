package com.xworkz.di.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.bean.Chrome;
import com.xworkz.di.bean.FireBox;
import com.xworkz.di.bean.Jio;
import com.xworkz.di.bridge.Browser;
import com.xworkz.di.bridge.Provider;
import com.xworkz.di.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		Browser browser = container.getBean(Chrome.class);
		browser.browse();
		Browser browser1 = container.getBean(FireBox.class);
		browser1.browse();

		//Provider provider = container.getBean(Jio.class);
		//provider.connect();

	}

}
