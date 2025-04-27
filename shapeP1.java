// Define an abstract class Shape in package P1. Inherit two more classes: Rectangle inpackage P2 and Circle in package P3. Write a program to ask the user for the type ofshape and then using the concept of dynamic method dispatch, display the area of theappropriate subclass. Also write appropriate methods to read the data. The main()function should not be in any package.

import java.util.Scanner;

// Abstract class Shape in package P1
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double area();

    // Abstract method to read data for the shape
    public abstract void readData();
}

// Rectangle class in package P2
class Rectangle extends Shape {
    private double length, width;

    // Method to read data for Rectangle
    @Override
    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    // Method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width;
    }
}

// Circle class in package P3
class Circle extends Shape {
    private double radius;

    // Method to read data for Circle
    @Override
    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    // Method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class (not in any package)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the type of shape
        System.out.print("Enter the type of shape (Rectangle / Circle): ");
        String shapeType = scanner.nextLine();

        Shape shape = null;

        // Create an object of the appropriate subclass based on user input
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else {
            System.out.println("Invalid shape type!");
            return;
        }

        // Read data for the shape
        shape.readData();

        // Display the area using dynamic method dispatch
        System.out.println("The area of the " + shapeType + " is: " + shape.area());
    }
}
