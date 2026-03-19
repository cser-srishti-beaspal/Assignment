/**
 * 
 */
package edu.jecrc.sdt_java.oops.inheripackage;

/**
 * 
 */
public final class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = " Software Development";
		branch = "Jaipur";
		company = "capgemini";
		city = "Jaipur";
		state="Rajasthan";
		country = "India";
	}
	
	public void task() {
		System.out.println("Software Development");
	}
	
	public void reverseKT() {
		System.out.println("Explaintion about Latest Software Development Tools and TEchnologies");
	}
	
	public void displaySoftwareDeveloperDetails() {
		System.out.println("Software DeveloperDetails");
		System.out.println("---------------");
		System.out.println("ID : "+ id);
		System.out.println("Name : " + name);
		System.out.println("mailID : " + mailId);
		System.out.println("Phoneno : " + contactNumber );
	}
	
	
}
