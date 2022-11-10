package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.PayingGuest;

public class HomeRunner {

	public static void main(String[] args) {
		PayingGuest guest = new PayingGuest();
		guest.stay();
		System.out.println(" ");
		guest.pay();

	}

}
