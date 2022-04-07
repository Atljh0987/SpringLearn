package com.practice.activity4;

import java.security.PublicKey;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach firstCoach = context.getBean("runCoach", Coach.class);
		Coach secondCoach = context.getBean("runCoach", Coach.class);
		
		System.out.println(firstCoach);
		System.out.println(secondCoach);
		
		
		context.close();
	}

}
