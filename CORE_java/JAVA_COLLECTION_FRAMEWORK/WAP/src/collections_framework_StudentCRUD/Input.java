package collections_framework_StudentCRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static void addStudent(ArrayList<Student> students, Scanner sc)
    {
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Contact No:");
        long contact = sc.nextLong();

        Student s = new Student(id,name,email,contact);
        students.add(s);

        System.out.println("Student Added Successfully");
    }
}