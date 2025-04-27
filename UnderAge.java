// Create an exception subclass UnderAge, which prints “Under Age” along with the agevalue when an object of UnderAge class is printed in the catch statement. Write a classexceptionDemo in which the method test() throws UnderAge exception if the variable agepassed to it as argument is less than 18. Write main() method also to show working of theprogram

// Custom exception subclass UnderAge
class UnderAge extends Exception {
    private int age;

    // Constructor to accept the age value
    public UnderAge(int age) {
        this.age = age;
    }

    // Override the toString() method to print the message
    @Override
    public String toString() {
        return "Under Age: " + age;
    }
}

// Main class exceptionDemo
public class exceptionDemo {

    // Method test() that throws UnderAge exception if age is less than 18
    public static void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);  // Throw UnderAge exception
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        int[] ages = {15, 20, 17};  // Sample ages to test

        for (int age : ages) {
            try {
                // Calling test method to check the age
                test(age);
            } catch (UnderAge e) {
                // Catch the UnderAge exception and print the exception object
                System.out.println(e);
            }
        }
    }
}
