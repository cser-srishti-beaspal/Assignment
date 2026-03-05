/**
 * 
 */
package edu.jecrc.sdt_java.array;

import java.util.Scanner;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of single dimensional integer type Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i =0;i<array.length;i++) {
			System.out.println("Enter the element at index "+i+ " : ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Element of the single dimensional integer type Array");
		for (int i :array) {
			System.out.println(i);
		}
		scanner.close();
//
		
//		//declaration
//		int[] array;
//		//instantiation
//		array = new int[5];
//		
//		//Both int[] array = new int[5];
//		System.out.println(array);
//		System.out.println(array.length);
//		int data =1;
//		for (int i =0;i<array.length;i++) {
//			array[i] = data;
//			data++;
//		}
//		
//		for (int i :array) {
//			System.out.println(i);
//		}
	}
	

}
