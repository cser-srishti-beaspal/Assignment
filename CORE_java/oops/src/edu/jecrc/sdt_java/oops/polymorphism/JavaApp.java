/**
 * 
 */
package edu.jecrc.sdt_java.oops.polymorphism;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
//		System.out.println(BasicCalculator.addition(2,10));
//		System.out.println(BasicCalculator.addition(2,10,30));
//		Child child = new Child();
//		child.career();
		Student std1 = new Student("RAJA");
		std1.displayStudentDetails();
		
		Student std2 = new Student("RAJA", "raja@gmail.com");
		std2.displayStudentDetails();
		
		Student std3 = new Student("RAJA","raja@gmail.com",987548735);
		std3.displayStudentDetails();
		
		
		
		
		
		
		
		
	}
}
