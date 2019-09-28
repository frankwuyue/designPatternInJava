package com.love2code.springdemo;

public class TableTennisCoach implements Coach {

	@Override
	public String getDailyWorkwork() {
		return "practice for smash 1000 times!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
