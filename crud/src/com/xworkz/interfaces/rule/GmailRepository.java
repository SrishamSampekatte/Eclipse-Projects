package com.xworkz.interfaces.rule;

public interface GmailRepository {
	boolean signIn(String email);

	default int total() {
		System.out.println("Counting email");
		return 10;
	}

}
