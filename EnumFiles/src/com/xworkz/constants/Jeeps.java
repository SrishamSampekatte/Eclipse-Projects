package com.xworkz.constants;

public enum Jeeps {
	
	JEEP_OWNER1(987415236L,2500),JEEP_OWNER2(987564858L,3500),JEEP_OWNER3(9877899945L,1800);
	
	public long phoneNo;
	public int price;
	
	
	private Jeeps(long phoneNo,int price)
	{
		
		this.phoneNo=phoneNo;
		this.price=price;
	}

}
