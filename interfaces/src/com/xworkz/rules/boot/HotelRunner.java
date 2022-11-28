package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Customer;
import com.xworkz.rules.made.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		Hotel hotel = new Customer();
		hotel.location();
		hotel.hygenic();
		hotel.variety();
		hotel.price();
		hotel.fres();

	}

}
