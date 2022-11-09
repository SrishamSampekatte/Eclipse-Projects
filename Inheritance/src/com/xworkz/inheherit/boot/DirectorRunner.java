package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.Prashanth;
import com.xworkz.inheherit.thing.Director;

public class DirectorRunner {

	public static void main(String[] args) {
		Director director = new Director("Neel", " Ugram", true);
		director.display();

		Prashanth prashanth = new Prashanth("Prashanth neel", "Ugram", true, "KGF-1& KGF-2");
		prashanth.display();

	}

}
