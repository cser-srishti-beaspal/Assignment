/**
 * 
 */
package edu.jecrc.sdt_java.oops.inheripackage;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
//		System.out.println(Child.sv);
//		Child.sm();
//		
//		Child child = new Child();
//		System.out.println(child.nsv);
//		child.nsm();
		
		
		// this is only give true or false if inheritance btw parent n child is present otherwise it will give error
		Parent parent = new Parent();
		System.out.println(parent instanceof Parent);
		System.out.println(parent instanceof Child);
		
		Child child = new Child();
		System.out.println(child instanceof Parent);
		System.out.println(child instanceof Parent);
		
	}
	
	
	
	

}
