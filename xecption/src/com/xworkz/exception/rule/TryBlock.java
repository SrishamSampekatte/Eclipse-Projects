package com.xworkz.exception.rule;

import java.security.acl.AclNotFoundException;

public class TryBlock {
	public void method1() throws AclNotFoundException {
		System.out.println("Running method one");
		method2();
	}

	public void method2() throws AclNotFoundException {
		System.out.println("Running method Two");
		method3();
		System.out.println("Running 3 in 2");
	}

	public void method3() throws AclNotFoundException {
		System.out.println("Running method Three");
		method4();
		System.out.println("Running 4 in 3");
	}

	public void method4() throws AclNotFoundException {
		System.out.println("Running method Four");
		method5();
		System.out.println("Running 5 in 4");
	}

	public void method5() throws AclNotFoundException {
		System.out.println("Running method Five");
		throw new AclNotFoundException();
	}
}
