package one_to_one;

public class University {
    String universityName;
    College college;

    public University(String universityName, College college) {
        this.universityName = universityName;
        this.college = college;
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        college.displayCollege();
    }
}
