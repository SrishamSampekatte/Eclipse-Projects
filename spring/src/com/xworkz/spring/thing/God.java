package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class God {
	private String name;
	private String powefull;

	public God() {
		System.out.println("Created god using spring ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPowefull() {
		return powefull;
	}

	public void setPowefull(String powefull) {
		this.powefull = powefull;
	}

	@Override
	public String toString() {
		return "God [name=" + name + ", powefull=" + powefull + "]";
	}

	public God(String name, String powefull) {
		super();
		this.name = name;
		this.powefull = powefull;
	}

}
