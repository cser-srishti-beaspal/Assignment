package com.capgemini.java_dev.framework.hibernate_jpa.main;

import java.util.Scanner;

import com.capgemini.java_dev.framework.hibernate_jpa.Employee;
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
	
	public static void execution1() {

	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();

	    Scanner sc = new Scanner(System.in);

	    while(true){

	        System.out.println("\n1 Add Employee");
	        System.out.println("2 Update Employee");
	        System.out.println("3 Delete Employee");
	        System.out.println("4 Display Employee");
	        System.out.println("5 Exit");

	        int choice = sc.nextInt();

	        switch(choice){

	        case 1:
	            et.begin();

	            System.out.println("Enter ID:");
	            int id = sc.nextInt();

	            System.out.println("Enter Name:");
	            String name = sc.next();

	            System.out.println("Enter Email:");
	            String email = sc.next();

	            System.out.println("Enter phno:");
	            Long phno = sc.nextLong();

	            Employee emp = new Employee(id,name,email,phno);

	            em.persist(emp);

	            et.commit();

	            System.out.println("Employee Added Successfully");
	            break;


	        case 2:

	            System.out.println("Enter Employee ID to update:");
	            int uid = sc.nextInt();

	            Employee emp1 = em.find(Employee.class, uid);

	            if(emp1 != null){

	                et.begin();

	                System.out.println("Enter New Email:");
	                emp1.setEmail(sc.next());

	                System.out.println("Enter New Phno:");
	                emp1.setPhno(sc.nextLong());

	                em.merge(emp1);

	                et.commit();

	                System.out.println("Employee Updated");

	            }else{
	                System.out.println("Employee Not Found");
	            }

	            break;


	        case 3:

	            System.out.println("Enter ID to delete:");
	            int did = sc.nextInt();

	            Employee emp2 = em.find(Employee.class, did);

	            if(emp2 != null){

	                et.begin();

	                em.remove(emp2);

	                et.commit();

	                System.out.println("Employee Deleted");

	            }else{
	                System.out.println("Employee Not Found");
	            }

	            break;


	        case 4:

	            System.out.println("Enter ID to display:");
	            int fid = sc.nextInt();

	            Employee emp3 = em.find(Employee.class, fid);

	            if(emp3 != null){
	                System.out.println(emp3);
	            }else{
	                System.out.println("Employee Not Found");
	            }

	            break;


	        case 5:
	            em.close();
	            emf.close();
	            System.exit(0);
	        }
	    }
	}
}
