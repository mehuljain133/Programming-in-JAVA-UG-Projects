// Review of Object Oriented Programming and Java Fundamentals: Structure of Java programs, Classes and Objects, Data types, Type Casting, Looping Constructs. 

public class OOPAndBasics {

    // Class with instance variables and methods
    static class Person {
        String name;  // Instance variable
        int age;

        // Constructor to initialize the object
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display the person's details
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main method (Entry point)
    public static void main(String[] args) {

        // 1. Object-Oriented Programming: Creating an object of Person class
        Person p1 = new Person("John", 25);  // Create an object of Person class
        p1.display();  // Calling the method to display the object data

        // 2. Data Types
        int age = 30;           // Primitive data type (int)
        double height = 5.9;    // Primitive data type (double)
        char grade = 'A';       // Primitive data type (char)
        boolean isStudent = true; // Primitive data type (boolean)

        // Displaying values of primitive types
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        // 3. Type Casting
        double castedValue = (double) age;  // Type casting from int to double
        System.out.println("Casted Age to Double: " + castedValue);

        // 4. Looping Constructs: For loop, While loop, Do-while loop

        // a) For loop
        System.out.println("\nFor Loop: Numbers 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // b) While loop
        System.out.println("\nWhile Loop: Numbers 1 to 5");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // c) Do-while loop
        System.out.println("\nDo-While Loop: Numbers 1 to 5");
        int doCount = 1;
        do {
            System.out.println(doCount);
            doCount++;
        } while (doCount <= 5);

        // 5. Additional Example: Creating an array and looping through it
        int[] numbers = {10, 20, 30, 40, 50};  // Array of integers
        System.out.println("\nArray Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. String Manipulation
        String str = "Java Programming";
        System.out.println("\nString Manipulation:");
        System.out.println("Length of String: " + str.length());  // Length of the string
        System.out.println("Uppercase String: " + str.toUpperCase());  // Convert to uppercase
        System.out.println("Substring: " + str.substring(5));  // Get substring from index 5
    }
}
