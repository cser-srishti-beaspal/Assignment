/**
 * 
 */
package edu.jecrc.sdt_java.oops.inheripackage;

/**
 * 
 */
public class Student {
	final int id;
	final String name;
	final String mailId;
	final long contactNumber;
	
	public Student(int id,String name,String mailId,long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	final static String city;
	final static String state;
	final static String country;
	static {
		city = "JAIPUR";
		state = "RAJASTHAN";
		country = "INDIA";
	}
	public void displayStudentDetails() {
		System.out.println("Student Details ");
		System.out.println("--------------");
		System.out.println(" ID: " + id);
		System.out.println(" mailId: " + id);
		System.out.println(" NAME: " + name);
		System.out.println(" ContactNumber: " + contactNumber);
		System.out.println(" City: " + city);
		System.out.println(" State: " + state);
		System.out.println(" Country: " + country);
		
	}

}
