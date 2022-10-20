package com.xworkz.constants.enums;

import com.xworkz.constants.Station;
import com.xworkz.constants.Type;

public class Train {
	
	public static String name="JanaShatabdi";
	public int num;
	public Station station;
	public Type type;
	
	public Train(int num,Station station,Type type) {
		this.num=num;
		this.station=station;
		this.type=type;
		
	}
		public void  ugibandi() {
			System.out.println(Train.name);
			System.out.println(this.num);
			System.out.println(this.station.name);
			System.out.println(this.type.no);
			System.out.println(this.type.price);
			
			
		}

}
