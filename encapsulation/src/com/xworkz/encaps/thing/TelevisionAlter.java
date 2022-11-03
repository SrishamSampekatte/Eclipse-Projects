package com.xworkz.encaps.thing;

public class TelevisionAlter {
	
	
	public void AlterTelevision(Television television) {
		television.setBrand("KODAK");
		television.setTelevisionModel("Kodak TV");
		television.setLaunchYear(2021);
		television.setPrice(16000);
		television.setSize(32);
		television.setSmartTV(true);
		television.setBlackAndwhiteTV(false);
		television.setHdmi(1);
		television.setUsb(1);
		television.setBuiltInWifi("yes");
		television.setWallMounted("yes");
		
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
		//boolean hasCreatePermission= Boolean.parseBoolean(request.getParameter("hasCreatePermission")); 
		//System.out.println(television.get);
		//System.out.println(television.get);
		
	}

}


