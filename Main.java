// Student Name: David Comeau
// Student ID: W0158668
// Instructor: Nadia Gouda
// Class: PROG1400 - Introduction to Object Oriented Programming
// Date: March 16, 2025
/*
 * Sources Used:
 * https://www.geeksforgeeks.org/student-information-management-system/
 * https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 * https://www.geeksforgeeks.org/inheritance-in-java/
 * https://www.geeksforgeeks.org/arraylist-in-java/
 * https://www.geeksforgeeks.org/scanner-class-in-java/
 */


import java.util.ArrayList; 
import java.util.Scanner;   

public class Main {
    private static ArrayList<Student> students = new ArrayList<>(); // This is our list where we store students.
    private static Scanner scanner = new Scanner(System.in); // This is our scanner, which we use for input.

    public static void main(String[] args) {
        while (true) {
            // Below are our displayed menu options. 
            System.out.println("\n*Student Management System*");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search For Student By ID");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt(); // This reads the choice the user selected.
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    System.out.println("Shutting down...");
                    return;
                default:
                    System.out.println("Error. Try input again.");
            }
        }
    }

    // Our method to add a new student to the class.
    private static void addStudent() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double GPA = scanner.nextDouble();
        scanner.nextLine();  

        // This creates and adds a student to the list. 
        Student student = new Student(name, age, address, major, GPA);
        students.add(student);
        System.out.println("New Student Added. Student ID: " + student.getStudentId());
    }

    // Want to see all students? This is the way.
    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }
        // This portion iterates through the list and displays the full details of each student. 
        for (Student student : students) {
            student.displayDetails();
            System.out.println("------------------------");
        }
    }

    // Want to search just by student ID? I got you covered.
    private static void searchStudentById() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}
