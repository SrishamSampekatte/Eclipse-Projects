package com.xworkz.exception.rule;

import java.security.acl.AclNotFoundException;

public class TryBlockRunner {

	public static void main(String[] args) throws AclNotFoundException {
		TryBlock tryBlock=new TryBlock();
		tryBlock.method1();
	}

}












