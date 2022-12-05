package com.xworkz.exception.rule;

public abstract class Person {
	private String name;
	private String location;
	private int age;
	private String branch;
	private String collegeName;

	public Person(String name, String location, int age, String branch, String collegeName) {
		this.name = name;
		this.location = location;
		this.age = age;
		this.branch = branch;
		this.collegeName = collegeName;
		
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.age);
		System.out.println(this.branch);
		System.out.println(this.collegeName);


	}

	public abstract void eat();

	public abstract void sleep();

}
