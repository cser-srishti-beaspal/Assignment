package collections_framework_Custom_Exception_handling;

public class Student {
	int id;
	String name;
	String email;
	long contactNo;
	public Student(int id, String name, String email, long contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	
}
