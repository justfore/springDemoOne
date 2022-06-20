package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String GetDailyWorkout() {
		
		return "Spend 30 min batting exercise.";
	}
	
	@Override
	public String GetDailyFortunes() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
