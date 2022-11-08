package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.PhotoShooting;
import com.xworkz.inheherit.thing.PhotoShoot;

public class PhotoShootRunner {

	public static void main(String[] args) {
		PhotoShoot shoot =new PhotoShoot("A-One","Pre-Wedding",55236);
		System.out.println(shoot.brand);
		System.out.println(shoot.price);
		System.out.println(shoot.type);
		
		System.out.println(" ");
		
		PhotoShooting shooting=new PhotoShooting("A-Two"," Wedding",1245);
		System.out.println(shooting.brand);
		System.out.println(shooting.type);
		System.out.println(shooting.price);
		
		
		

	}

}
