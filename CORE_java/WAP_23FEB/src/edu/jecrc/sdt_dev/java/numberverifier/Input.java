/**
 * 
 */
package edu.jecrc.sdt_dev.java.numberverifier;
import java.util.Scanner;

/**
 * 
 */
public class Input {
	public int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
}
