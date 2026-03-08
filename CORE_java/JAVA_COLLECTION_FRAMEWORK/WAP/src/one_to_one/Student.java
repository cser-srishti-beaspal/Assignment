package one_to_one;

public class Student {
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudent() {
        System.out.println("Student: " + studentName);
    }
}