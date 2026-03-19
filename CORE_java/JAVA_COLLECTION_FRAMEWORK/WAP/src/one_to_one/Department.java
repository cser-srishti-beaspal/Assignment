package one_to_one;

public class Department {
    String deptName;
    Branch branch;

    public Department(String deptName, Branch branch) {
        this.deptName = deptName;
        this.branch = branch;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        branch.displayBranch();
    }
}
