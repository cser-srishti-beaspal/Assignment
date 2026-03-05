/**
 * 
 */
package edu.jecrc.sdt_java.oops.inheripackage;

/**
 * 
 */
public sealed class Employee permits SoftwareDeveloper {
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	
	public void entry() {
		System.out.println(" Employee Entered Into The Office");
	}
	
	public void logIn() {
		System.out.println(" Employee Logged Into The Office");
	}
	
	public void logOut() {
		System.out.println(" Employee Logged Out The Office");
	}
	
	public void exit() {
		System.out.println(" Employee Exited Into The Office");
	}

}
