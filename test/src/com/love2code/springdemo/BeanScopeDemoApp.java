package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if is the same bean
		boolean result = ( coach == alphaCoach );
		
		System.out.println("Pointing to the same object: " + result);
		System.out.println("\nMemory location for coach" + coach);
		System.out.println("\nMemory location for coach" + alphaCoach);
		
		context.close();
	}

}
