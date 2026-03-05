/**
 * 
 */
package edu.jecrc.sdt_java.oops.java_package;

/**
 * 
 */
public class Members {
	public static int sv;
	public static void sm() {
		System.out.println("Static sm()");
	}
	static {
		System.out.println("static block or initializer");
	}
	public static int nsv;
	public static void nsm() {
		System.out.println("non Static sm()");
	}
	{
		System.out.println("non static block or initializer");
	}

}
