/**
 * 
 */
package edu.jecrc.sdt_dev.java.characterverifier;
import java.util.Scanner;

/**
 * 
 */
public class Input {
	public char getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		sc.close();
		return ch;
	}
}
