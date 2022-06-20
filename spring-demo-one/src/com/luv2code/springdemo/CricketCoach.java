package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	//add private fields
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method setEmailAddress");
		this.emailAddress = emailAddress;
	}




	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method setTeam");
		this.team = team;
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.out.println("Cricket Coach: inside setter method setRandomFortuneService");
		this.randomFortuneService = randomFortuneService;
	}
	
	
	//create no arg constructor
	public CricketCoach()
	{
		System.out.println("Cricket Coach: inside no arg constructor");
	}

	@Override
	public String GetDailyWorkout() {
		return "Practice cricket 25 minutes a day.";
	}

	@Override
	public String GetDailyFortunes() {
		
		return randomFortuneService.getFortune();
	}


	
	
	

}
