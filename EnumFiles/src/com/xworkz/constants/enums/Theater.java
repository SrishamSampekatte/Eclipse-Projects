package com.xworkz.constants.enums;

import com.xworkz.constants.Movie;
import com.xworkz.constants.PayMode;
import com.xworkz.constants.SeatType;


public class Theater {
	
	public String name;
	public String area;
	public Movie movie=Movie.KANTARA;
	public SeatType seatType=SeatType.PLATINUM;
	public int capacity;
	public boolean parking;
	public boolean dolby;
	public PayMode payMode=PayMode.CASH;
	
	// here  Movie,SeatType and PayMode are considered as DataTypes.
	public Theater(String name,String area,Movie movie,SeatType seatType,int capacity,boolean parking,boolean dolby,PayMode payMode)
	{
		this.name=name;
		this.area=area;
		this.capacity=capacity;
		this.parking=parking;
		this.dolby=dolby;
		this.payMode=payMode;
		this.movie=movie;
		this.seatType=seatType;
		
	}
	
	
	public void belliParade() 
	{
		System.out.println("Movie Nodok hogana");
		System.out.println(name);
		System.out.println(area);
		System.out.println(movie);
		System.out.println(seatType);
		System.out.println(capacity);
		System.out.println(parking);
		System.out.println(dolby);
		System.out.println(payMode);
	}
	

	
	
	
	
	

}
