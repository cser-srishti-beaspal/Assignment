package collections_framework_Custom_Exception_handling;

public class JavaApp {
	public static void execution() {
		Student student = new Student(1, "raja", "raja@gmail.com", 74687232);
		try {
			DB.verifier(student);
		} catch(Throwable throwable){
			throwable.printStackTrace();
			System.out.println("Student Object Not Found ! Please pass PRoper Object");
			
		}
	}
}
