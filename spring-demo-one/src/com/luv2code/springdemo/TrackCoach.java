package com.luv2code.springdemo;

public class TrackCoach implements ICoach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do Id: " + fortuneService.getFortune();
	}

}
