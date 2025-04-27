//Create a class TwoDim which contains private members as x and y coordinates in
//package P1. Define the default constructor, a parameterized constructor and override
//toString() method to display the co-ordinates. Now reuse this class and in package P2
//create another class ThreeDim, adding a new dimension as z as its private member.
//Define the constructors for the subclass and override toString() method in the subclass
//also. Write appropriate methods to show dynamic method dispatch. The main() function
//should be in a package P

// Package P1
package P1;

public class TwoDim {
    private double x, y;

    // Default constructor
    public TwoDim() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public TwoDim(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Coordinates: (" + x + ", " + y + ")";
    }
}

// Package P2
package P2;

import P1.TwoDim;  // Importing the TwoDim class from package P1

public class ThreeDim extends TwoDim {
    private double z;

    // Default constructor
    public ThreeDim() {
        super();  // Call the default constructor of TwoDim
        this.z = 0;
    }

    // Parameterized constructor
    public ThreeDim(double x, double y, double z) {
        super(x, y);  // Call the parameterized constructor of TwoDim
        this.z = z;
    }

    // Getter method for z
    public double getZ() {
        return z;
    }

    // Override the toString() method in ThreeDim class
    @Override
    public String toString() {
        return super.toString() + ", z: " + z;
    }
}

// Package P
package P;

import P1.TwoDim;
import P2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        // Create an object of TwoDim class
        TwoDim twoDimObj = new TwoDim(2.0, 3.0);
        System.out.println("TwoDim object: " + twoDimObj.toString());

        // Create an object of ThreeDim class
        ThreeDim threeDimObj = new ThreeDim(2.0, 3.0, 4.0);
        System.out.println("ThreeDim object: " + threeDimObj.toString());

        // Demonstrating dynamic method dispatch
        // Reference of TwoDim type but object of ThreeDim
        TwoDim dynamicDispatchObj = new ThreeDim(5.0, 6.0, 7.0);
        System.out.println("\nDynamic Method Dispatch:");
        System.out.println("Dynamic Dispatch object (ThreeDim): " + dynamicDispatchObj.toString());
    }
}
