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

 // This class extends the person class, and allows the addition of attributes specific to a student.
class Student extends Person {
    private static int idCounter = 1000; // Our static counter for unique ID's.
    private String studentId;
    private String major;
    private double GPA;

    // Our default constructor for our default values.
    public Student() {
        super("Unknown", 0, "Unknown");
        this.studentId = generateStudentId();
        this.major = "Undeclared";
        this.GPA = 0.0;
    }

    // This is our parameterized constructor so we can initialize a Student object with the values we give it.
    public Student(String name, int age, String address, String major, double GPA) {
        super(name, age, address); // This calls on the constructor of the Person class.
        this.studentId = generateStudentId();
        this.major = major;
        this.GPA = GPA;
    }

    // Static method to generate a unique student ID
    private static String generateStudentId() {
        return "S" + (idCounter++);
    }

    // Getters and Setters
    // Getter for Student ID
    public String getStudentId() {
        return studentId;
    }

    // Getter and Setter for Major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Getter and Setter for GPA
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // This nifty little doodad overrides the displayDetails method to include details specific to one student.
    @Override
    public void displayDetails() {
        super.displayDetails(); // We call displayDetails() from the Person class.
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
    }
}
