/**
 * 
 */
package edu.jecrc.sdt_java.oops.polymorphism;

/**
 * 
 */
public class Student {
	String name;
	String mailId;
	long contactNumber;
	public Student(String name) {
		this.name = name;
	}
//	public Student(String name, String mailId) {
//		this.name = name;
//		this.mailId = mailId;
//	}
//	public Student(String name, String mailId, long contactNumber) {
//		this.name = name;
//		this.mailId = mailId;
//		this.contactNumber = contactNumber;
//	}
	public Student(String name, String mailId) {
		this(name);
		this.mailId = mailId;
	}
	public Student(String name, String mailId, long contactNumber) {
		this(name,mailId);
		this.contactNumber = contactNumber;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student DEtails");
		System.out.println("---------------");
		System.out.println("Name: " + name);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("---------------");
	}
	

}
