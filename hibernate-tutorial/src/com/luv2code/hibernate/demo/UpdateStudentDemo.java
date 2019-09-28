package com.luv2code.hibernate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class UpdateStudentDemo {

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
			int studentId = 1;
			
			// now get a new session and start a new transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve the student based on the id
			System.out.println("Getting student with id:" + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student......");
			
			myStudent.setEmail("wuyuefrank@gmail.com");
			// commit the transaction
			session.getTransaction().commit();
			
			// now get a new session and start a new transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all students
			session.createQuery("update Student set email = 'wuyuefrank@gmail.com'").executeUpdate();
			List<Student> studentList = session.createQuery("from Student").getResultList();
			
			for (Student student : studentList) {
				System.out.println(student);
			}
			// commit the transaction
			session.getTransaction().commit();			
			
			System.out.println("Done.");
			
			
		} finally {
			factory.close();
		}
	}

}
