//Design a class Complex having a real part (x) and an imaginary part (y). Provide methods to perform the following on complex numbers

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to divide two complex numbers
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realQuotient, imaginaryQuotient);
    }

    // Method to display the complex number in the form a + bi
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        // Creating two complex numbers
        Complex c1 = new Complex(4, 5); // 4 + 5i
        Complex c2 = new Complex(2, 3); // 2 + 3i

        System.out.print("Complex Number 1: ");
        c1.display();

        System.out.print("Complex Number 2: ");
        c2.display();

        // Adding the complex numbers
        Complex sum = c1.add(c2);
        System.out.print("\nSum: ");
        sum.display();

        // Subtracting the complex numbers
        Complex difference = c1.subtract(c2);
        System.out.print("\nDifference: ");
        difference.display();

        // Multiplying the complex numbers
        Complex product = c1.multiply(c2);
        System.out.print("\nProduct: ");
        product.display();

        // Dividing the complex numbers
        Complex quotient = c1.divide(c2);
        System.out.print("\nQuotient: ");
        quotient.display();
    }
}
