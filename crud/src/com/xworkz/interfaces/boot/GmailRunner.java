package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.rule.GmailRepository;
import com.xworkz.interfaces.rule.GmailRepositoryImp;

public class GmailRunner {

	public static void main(String[] args) {
		GmailRepository mail = new GmailRepositoryImp();
		mail.signIn("email1");
		mail.signIn("email2");
		mail.signIn("email3");
		mail.signIn("email4");
		mail.signIn("email5");
		mail.signIn("email6");
		mail.signIn("email7");
		mail.signIn("email8");
		mail.signIn("email9");
		mail.signIn("email10");
		mail.signIn("email1");

		System.out.println(mail.total());
	}

}
