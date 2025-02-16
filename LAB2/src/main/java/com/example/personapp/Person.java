package com.example.personapp; // Defines the package where the class is located

public class Person { // Declares a public class named Person
    private String name; // Private instance variable to store the name of the person
    private int age; // Private instance variable to store the age of the person

    // Constructor to initialize Person object with name and age
    public Person(String name, int age) {
        setName(name); // Calls the setName method to validate and assign the name
        setAge(age); // Calls the setAge method to validate and assign the age
    }

    // Getter method to retrieve the name
    public String getName() {
        return name; // Returns the value of the name instance variable
    }

    // Setter method to assign and validate the name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) { // Checks if the name is null or empty after trimming spaces
            throw new IllegalArgumentException("Name cannot be empty."); // Throws an exception if name is invalid
        }
        this.name = name; // Assigns the validated name to the instance variable
    }

    // Getter method to retrieve the age
    public int getAge() {
        return age; // Returns the value of the age instance variable
    }

    // Setter method to assign and validate the age
    public void setAge(int age) {
        if (age < 0 || age > 120) { // Checks if the age is within the valid range (0-120)
            throw new IllegalArgumentException("Age must be between 0 and 120."); // Throws an exception if age is invalid
        }
        this.age = age; // Assigns the validated age to the instance variable
    }

    // Overriding the toString() method to provide a string representation of the Person object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}"; // Returns a formatted string with the person's details
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        try { // Start of try block to handle exceptions
            Person person = new Person("Neel", 20); // Creates a new Person object with name "Neel" and age 20
            System.out.println(person); // Prints the string representation of the Person object
        } catch (IllegalArgumentException e) { // Catches any IllegalArgumentException thrown by the setters
            System.out.println("Error: " + e.getMessage()); // Prints the error message if an exception occurs
        }
    }
}
