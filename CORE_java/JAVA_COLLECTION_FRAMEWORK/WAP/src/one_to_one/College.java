package one_to_one;

public class College {
    String collegeName;
    Department department;

    public College(String collegeName, Department department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    public void displayCollege() {
        System.out.println("College: " + collegeName);
        department.displayDepartment();
    }
}