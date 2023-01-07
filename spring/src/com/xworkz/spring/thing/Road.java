package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Road {
	private String roadName;
	private String location;

	public Road() {
		System.out.println(" Creating Road by Spring ");
	}

	public Road(String roadName, String location) {
		super();
		this.roadName = roadName;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Road [roadName=" + roadName + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
