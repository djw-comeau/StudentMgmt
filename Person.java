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

 // This class represents a generic Person with common attributes. In other words, like me, just a regular, everyday, normal guy.

class Person {
    private String name;
    private int age;
    private String address;

    // Constructor used to initialize a Person object.
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and Setters
    // This is our Getter and Setter for the Student name.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Address.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Lastly, our Method to display the person's details.
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}