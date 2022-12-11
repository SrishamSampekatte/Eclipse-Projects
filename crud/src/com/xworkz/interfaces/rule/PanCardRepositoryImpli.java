package com.xworkz.interfaces.rule;

public class PanCardRepositoryImpli implements PanCardRepository {

	private String[] panCards = new String[10];
	private int panCardIndex = 0;

	@Override
	public boolean register(String card) {
		System.out.println("running method register");
		if (this.panCardIndex > panCards.length) {
			throw new PanSizeExceededException();
		}
		this.panCards[panCardIndex] = card;
		panCardIndex++;
		return false;
	}

	public int total() {
		return PanCardRepository.super.total();

	}

}
