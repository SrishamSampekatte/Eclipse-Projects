package com.xworkz.rules.follow;

import com.xworkz.rules.made.HostelRule;

public class Hostelites implements HostelRule {

	@Override
	public String wakeup() {
		System.out.println(" Wake up early ");
		return null;
	}

	@Override
	public String breakFast() {
		System.out.println("come in line");
		return null;
	}

	@Override
	public String antiRag() {
		System.out.println(" Not to rag juniors");
		return null;
	}

	@Override
	public String gameTime() {
		System.out.println("Play during game time");
		return null;
	}

	@Override
	public String StudyTime() {
		System.out.println("Comp study ");
		return null;
	}

}
