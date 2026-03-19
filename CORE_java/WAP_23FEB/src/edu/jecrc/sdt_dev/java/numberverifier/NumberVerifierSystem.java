/**
 * 
 */
package edu.jecrc.sdt_dev.java.numberverifier;

/**
 * 
 */
public class NumberVerifierSystem {
	public static void verifier(int n) {
		if(n==0) {
			System.out.println("Number is Zero ");
			return ;
		} else if(n<0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Positive");
		}
		
		if(n%2 == 0) {
			System.out.println(" and also Even");
		} else {
			System.out.println(" and also Odd");
		}
	}

}
