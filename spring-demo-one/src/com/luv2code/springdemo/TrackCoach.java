package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	

	//define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String GetDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String GetDailyFortunes() {
		
		return "Just do it! " + fortuneService.getFortune();
	}

}
