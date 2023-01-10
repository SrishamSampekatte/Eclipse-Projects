package com.xworkz.springvalue.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private int duration;
	private String startingMonth;

	public Season() {
		System.out.println("Created Season using Spring");
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}

	@Value("3")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("October")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
