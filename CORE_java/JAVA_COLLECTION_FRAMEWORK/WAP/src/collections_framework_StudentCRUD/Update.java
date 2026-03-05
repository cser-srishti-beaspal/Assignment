package collections_framework_StudentCRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Update {

    public static void updateStudent(ArrayList<Student> students, Scanner sc) {

        System.out.println("Enter ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {

            if (s.getId() == id) {

                System.out.println("What do you want to update?");
                System.out.println("1 Update Email");
                System.out.println("2 Update Contact No");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter New Email:");
                        String email = sc.nextLine();
                        s.setEmail(email);
                        System.out.println("Email Updated Successfully");
                        break;

                    case 2:
                        System.out.println("Enter New Contact No:");
                        long contact = sc.nextLong();
                        s.setContactNo(contact);
                        System.out.println("Contact Updated Successfully");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

                return;
            }
        }

        System.out.println("Student Not Found");
    }
}