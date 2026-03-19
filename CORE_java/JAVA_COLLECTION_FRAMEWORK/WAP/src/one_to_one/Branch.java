package one_to_one;

public class Branch {
    String branchName;
    Student student;

    public Branch(String branchName, Student student) {
        this.branchName = branchName;
        this.student = student;
    }

    public void displayBranch() {
        System.out.println("Branch: " + branchName);
        student.displayStudent();
    }
}