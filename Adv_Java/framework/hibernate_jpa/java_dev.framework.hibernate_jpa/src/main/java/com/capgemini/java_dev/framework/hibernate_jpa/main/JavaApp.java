package com.capgemini.java_dev.framework.hibernate_jpa.main;

import com.capgemini.java_dev.framework.hibernate_jpa.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JavaApp {
	public static void execution() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("raja");
		student1.setEmail("raja@gmail.com");
		student1.setPhn(768743973L);
//		entityManager.persist(student1);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("rani");
		student2.setEmail("rani@gmail.com");
		student2.setPhn(46546573L);
//		entityManager.persist(student2);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("ram");
		student3.setEmail("ram@gmail.com");
		student3.setPhn(98546573L);
//		entityManager.persist(student3);
		
		Student student4 = new Student();
		student4.setId(4);
		student4.setName("seeta");
		student4.setEmail("seeta@gmail.com");
		student4.setPhn(90946573L);
//		entityManager.persist(student4);
		
		
//		entityTransaction.commit();
		
//		Student student = entityManager.find(Student.class,1);
//		System.out.println(student);
		
		Student student = entityManager.find(Student.class,2);
		if(student != null) {
			System.out.println(student);
			student.setEmail("ranipari@gmail.com");
			student.setName("ranipari");
			student.setPhn(324547L);
			entityManager.merge(student);
			System.out.println("Successfully update");
		} else {
			System.out.println("Student not found !");
		}
		
		Student data = entityManager.find(Student.class,2);
		entityManager.remove(data);
		entityTransaction.commit();
		
		entityManager.close();
		
		
		System.out.println("Hello World!");
	}
}
