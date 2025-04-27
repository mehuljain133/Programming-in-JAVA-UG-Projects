// Interfaces Interface basics; Defining, implementing and extending interfaces; Implementing multiple inheritance using interfaces Packages Basics of packages, Creating and accessing packages, System packages, Creating user defined packages

// Defining a user-defined package
package com.example.animals;

// Interface 1: Animal interface
interface Animal {
    void sound();  // Abstract method
}

// Interface 2: Swimmer interface
interface Swimmer {
    void swim();  // Abstract method
}

// Class Dog implementing both Animal and Swimmer interfaces
class Dog implements Animal, Swimmer {
    // Providing implementation for the sound() method from Animal interface
    public void sound() {
        System.out.println("Woof!");
    }

    // Providing implementation for the swim() method from Swimmer interface
    public void swim() {
        System.out.println("Dog is swimming.");
    }
}

// Defining another user-defined package
package com.example.vehicles;

// Interface: Vehicle interface
interface Vehicle {
    void drive();  // Abstract method
}

// Class Car implementing the Vehicle interface
class Car implements Vehicle {
    // Providing implementation for the drive() method from Vehicle interface
    public void drive() {
        System.out.println("Car is driving.");
    }
}

// Main program to demonstrate package import, interfaces, and multiple inheritance
import com.example.animals.Dog;
import com.example.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        // Demonstrating Animal and Swimmer interface implementation in Dog class
        Dog dog = new Dog();
        dog.sound();  // Woof!
        dog.swim();   // Dog is swimming.

        // Demonstrating Vehicle interface implementation in Car class
        Car car = new Car();
        car.drive();  // Car is driving.

        // Using system package java.util to work with an ArrayList
        import java.util.ArrayList;

        // Creating and using ArrayList from java.util package
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Car");
        list.add("Swimming");

        System.out.println("Items in the list: " + list);
    }
}

