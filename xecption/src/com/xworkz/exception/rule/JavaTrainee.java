package com.xworkz.exception.rule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, String location, int age, String branch, String collegeName) {
		super(name, location, age, branch, collegeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("Running uploadedTask");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Running completedProgram");
		return false;
	}

	@Override
	public void eat() {
		System.out.println("Running eat");

	}

	@Override
	public void sleep() {
		System.out.println("Running sleep");

	}

	public void training() {
		System.out.println("Running training");
	}

	public void executeProgram() {
		System.out.println("Running executeProgram");
	}

}
