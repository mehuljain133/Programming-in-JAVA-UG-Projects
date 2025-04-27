// Exception handling using the main keywords of exception handling: try, catch, throw, throws and finally; Nested try, multiple catch statements, creating user defined exceptions

// Custom Exception Class (User-defined Exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Pass the error message to the superclass
    }
}

public class ExceptionHandlingExample {

    // Method that may throw an exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        // Example 1: Basic try-catch block
        try {
            int result = 10 / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());  // Handle divide by zero error
        }

        // Example 2: Nested try-catch block
        try {
            try {
                int[] arr = new int[2];
                arr[3] = 10;  // This will cause an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Error: " + e.getMessage());
                throw new Exception("Re-throwing from inner try-catch.");  // Re-throwing exception
            }
        } catch (Exception e) {
            System.out.println("Handled rethrown exception: " + e.getMessage());
        }

        // Example 3: Multiple catch blocks
        try {
            String str = null;
            System.out.println(str.length());  // This will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }

        // Example 4: `throw` keyword to throw a user-defined exception
        try {
            checkAge(15);  // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught user-defined exception: " + e.getMessage());
        }

        // Example 5: `throws` keyword in method declaration
        try {
            checkAge(20);  // This will print "Age is valid."
        } catch (InvalidAgeException e) {
            System.out.println("Caught user-defined exception: " + e.getMessage());
        }

        // Example 6: finally block
        try {
            int result = 10 / 2;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error in calculation: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Cleanup can be done here.");
        }
    }
}
