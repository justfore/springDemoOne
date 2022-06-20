package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	String [] fortuneServices = {"you get 10% for every course!", "you get the first 3 hours of a new course for free!", 
	"buy two pay one!  "};
	
	@Override
	public String getFortune() {
		
		return fortuneServices[new Random().nextInt(fortuneServices.length)];
	}

}
