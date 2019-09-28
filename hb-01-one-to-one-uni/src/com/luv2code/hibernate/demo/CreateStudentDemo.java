package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		//
		try {
			// use the session block
			System.out.println("Creating new student object.");
			Student tempStudent = new Student("Paul", "Smith", "paul_smith@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student
			System.out.println("Saving the student object.");
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done.");
			
			
		} finally {
			factory.close();
		}
	}

}
