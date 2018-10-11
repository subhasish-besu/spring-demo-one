package com.subha.springdemo;

public class BaseballCoach implements Coach {
	// define a private field for the dependency 
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
		
	}	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune		
		return fortuneService.getFortune();
	}

}
