package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.Ravi;
import com.xworkz.inheherit.thing.Criminal;

public class CriminalRunner {

	public static void main(String[] args) {
		Criminal crimi = new Criminal("Darode", "Male", true);
		crimi.display();

		Ravi ravi = new Ravi("Bhoogata", "male", false, 25);
		ravi.display();

	}

}
