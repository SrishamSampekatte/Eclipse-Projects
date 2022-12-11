package com.xworkz.interfaces.rule;

public class GmailRepositoryImp implements GmailRepository {
	private String[] gmails = new String[10];
	private int gmailIndex = 0;

	@Override
	public boolean signIn(String email) {
		System.out.println("running method register");
		if (this.gmailIndex > gmails.length) {
			throw new GmailExceededException();
		}
		this.gmails[gmailIndex] = email;
		gmailIndex ++;
		return false;
	}

	public int total() {
		return GmailRepository.super.total();

	}

}
