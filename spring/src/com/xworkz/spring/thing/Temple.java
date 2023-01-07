package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	private String name;
	private boolean favt;

	public Temple() {
		System.out.println("Created temple using spring ");
	}

	public Temple(String name, boolean favt) {
		super();
		this.name = name;
		this.favt = favt;
	}

	@Override
	public String toString() {
		return "Temple [name=" + name + ", favt=" + favt + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFavt() {
		return favt;
	}

	public void setFavt(boolean favt) {
		this.favt = favt;
	}

}
