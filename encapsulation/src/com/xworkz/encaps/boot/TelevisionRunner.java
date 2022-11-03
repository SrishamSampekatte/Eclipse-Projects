package com.xworkz.encaps.boot;

import com.xworkz.encaps.thing.Television;
import com.xworkz.encaps.thing.TelevisionAlter;

public class TelevisionRunner {

	public static void main(String[] args) {
		
			Television television = new Television();
			System.out.println(television.getBrand());
			System.out.println(television.getTelevisionModel());
			System.out.println(television.getLaunchYear());
			System.out.println(television.getPrice());
			System.out.println(television.getSize());
			System.out.println(television.getSize());
			System.out.println(television.getHdmi());
			System.out.println(television.getUsb());
			System.out.println(television.getBuiltInWifi());
			System.out.println(television.getWallMounted());
			System.out.println("==========================================");
			TelevisionAlter televisionAlter = new TelevisionAlter();
			televisionAlter.AlterTelevision(television);
			televisionAlter.AlterTelevision(television);
		}


	}


