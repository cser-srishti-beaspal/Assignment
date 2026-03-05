/**
 * 
 */
package edu.ju.wap.mod2.pack;
import java.util.Scanner;

/**
 * 
 */
public class Input {
	public static getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a no");
		String number = sc.nextLine();
		sc.close();
		return number;
		
	}

}
