/**
 * 
 */
package edu.ju.wap.mod1.pack;
import java.util.Scanner;

/**
 * 
 */
public class Input {
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a no: ");
		String number = sc.nextLine();
		sc.close();
		return number;
	}
}
