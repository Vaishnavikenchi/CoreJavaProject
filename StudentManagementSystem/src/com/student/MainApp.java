package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String args[]) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();

            if(choice == 1) {

                System.out.println("Enter ID:");
                int id = sc.nextInt();

                System.out.println("Enter Name:");
                String name = sc.next();

                System.out.println("Enter Age:");
                int age = sc.nextInt();

                Student s = new Student(id, name, age);
                students.add(s);

                System.out.println("Student Added!");
            }
            else if(choice == 2) {

                for(Student s : students) {
                    s.display();
                }
            }
            else if(choice == 3) {

                System.out.print("Enter student id:");
                int id = sc.nextInt();

                boolean found = false;

                for(Student s : students) {

                    if(s.id == id) {
                        s.display();
                        found = true;
                    }
                }
                if(!found) {
                    System.out.println("Student not found");
                }
            }
        } while(choice != 4);
        System.out.println("Exited");
    }
}
