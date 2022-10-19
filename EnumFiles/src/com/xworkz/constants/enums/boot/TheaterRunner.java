package com.xworkz.constants.enums.boot;

import com.xworkz.constants.Movie;
import com.xworkz.constants.PayMode;
import com.xworkz.constants.SeatType;
import com.xworkz.constants.enums.Theater;

public class TheaterRunner {

	public static void main(String[] args)
	{
		Theater theater=new  Theater("Navarang","Navarang Circle",Movie.GANDHADA_GUDI,SeatType.GOLD,500,true,true,PayMode.CASH);
		theater.belliParade();

	}

}
