package collections_framework_Custom_Exception_handling;

public class StudentNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Student Object Doesn,t Exists!";
	}

}
