/**
 * 
 */
package edu.jecrc.sdt_java.typecasting;



/**
 * 
 */
public class JavaApp {
	public static void execution() {
//		Typecasting.widening();
//		Typecasting.narrowing();
//		Typecasting.charWidening();
//		Typecasting.charNarrowing();
//		Typecasting.boxing();
//		Typecasting.autoboxing();
//		Typecasting.unboxing();
//		Typecasting.autounboxing();
		
		Employee employee;
		//GENERALIZATION
		employee= new SoftwareDeveloper();
		employee.meeting();
		employee.entry();
		employee.exit();
		
		//SPECIFICATION
		SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)employee;
		softwareDeveloper.task();
		softwareDeveloper.reverseKT();
		
		employee = new SoftwareTester();
		employee.meeting();
		employee.entry();
		employee.exit();
		
		SoftwareTester softwareTester = (SoftwareTester)employee;
		softwareTester.task();
		softwareTester.reverseKT();
	}

}
