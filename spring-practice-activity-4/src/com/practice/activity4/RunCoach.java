package com.practice.activity4;

public class RunCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run Trainging";
	}

	@Override
	public String getDailyFortune() {
		return "Training with good luck";
	}

	public void initMethod() {
		System.out.println("Init bean");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy bean");
	}

}
