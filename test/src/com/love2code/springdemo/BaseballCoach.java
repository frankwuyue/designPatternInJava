package com.love2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkwork() {
		return "spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
