package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Browser;
import com.xworkz.di.bridge.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public Chrome() {
		System.out.println("Craeted chrome using  no arg constructor ");
	}

	public void browse() {
		System.out.println("running browse in Chrome... ");
		provider.connect();
	}

}
