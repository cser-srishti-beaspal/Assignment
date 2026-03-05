package collections_framework_StudentCRUD;

import java.util.ArrayList;

public class JavaApp {

    public static void displayStudents(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        for (Student s : students) {

            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Contact: " + s.getContactNo());
            System.out.println("----------------------");
        }
    }
}