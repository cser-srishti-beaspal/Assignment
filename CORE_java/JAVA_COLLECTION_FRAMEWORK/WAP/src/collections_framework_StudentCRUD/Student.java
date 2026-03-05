package collections_framework_StudentCRUD;

public class Student {
	private int id;
	private String name;
	private String email;
	private long contactNo;
	
	
	public Student(int id, String name, String email, long contactNo) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}
	
	public Student() {
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
	
}
