/**
 * 
 */
package edu.jecrc.sdt_java.typecasting;

/**
 * 
 */
public sealed class Employee permits SoftwareDeveloper, SoftwareTester {
	public void entry() {
		System.out.println("Employee enter into the campus");
	}
	
	public void exit() {
		System.out.println("Employee exit from the campus");
	}
	
	public void meeting() {
		System.out.println("Employee is attending the meeting");
	}
}
