/**
 * 
 */
package edu.jecrc.sdt_java.oops.java_package;

/**
 * 
 */
public class Student {
	int id;
	String name;
	String email;
	int phno;
	Student(int id , String name , String email , int phno){
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}
	static String city;
	static String country;
	static String state;
	static {
		Student.city= "Jaipur";
		Student.state= "Rajasthan";
		Student.country= "India";
	}
	
	public void displayStudentDetails() {
		System.out.println("Student id is "+id);
		System.out.println("Student name is "+name);
		System.out.println("Student email is "+email);
		System.out.println("Student phno is "+phno);
		System.out.println("Student city is "+city);
		System.out.println("Student state is "+state);
		System.out.println("Student country is "+country);
		System.out.println("----------------");
		
	}
}


