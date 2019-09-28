package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// check if is the same bean
		System.out.println(coach.getDailyWorkwork());
		context.close();
	}

}
