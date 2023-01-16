package com.xworkz.associationspring.thing;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	private Camera camera;
	private Battery batter;

	public CameraMan() {
		System.out.println("Created cameraman using no arg cons");
	}

}
