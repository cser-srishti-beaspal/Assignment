package collections_framework_Custom_Exception_handling;

public class DB{
	public static void verifier(Student student) throws StudentNotFoundException{
		if(student !=null) {
			System.out.println(student);
		}
		else {
			throw new StudentNotFoundException();
		}
		
	}
}
