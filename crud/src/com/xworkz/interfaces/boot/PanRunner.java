package com.xworkz.interfaces.rule;

public class PanRunner {

	public static void main(String[] args) {
		PanCardRepository card = new PanCardRepositoryImpli();
		card.register("Pan1");
		card.register("Pan2");
		card.register("Pan3");
		card.register("Pan4");
		card.register("Pan5");
		card.register("Pan6");
		card.register("Pan7");
		card.register("Pan8");
		card.register("Pan9");
		card.register("Pan10");
		card.register("Pan1");

		System.out.println(card.total());
	}

}
