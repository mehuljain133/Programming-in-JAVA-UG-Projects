// Write a program to implement stack. Use exception handling to manage underflow and overflow conditions.

// Custom exception for Stack Overflow
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

// Custom exception for Stack Underflow
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

// Stack class implementing basic stack operations
class Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;  // Indicates that the stack is empty
    }

    // Push an element to the stack
    public void push(int value) throws StackOverflowException {
        if (top == maxSize - 1) {
            throw new StackOverflowException("Stack Overflow: Cannot push " + value + ", stack is full.");
        }
        stack[++top] = value;
        System.out.println("Pushed " + value + " to stack.");
    }

    // Pop an element from the stack
    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack Underflow: Cannot pop, stack is empty.");
        }
        int value = stack[top--];
        System.out.println("Popped " + value + " from stack.");
        return value;
    }

    // Peek the top element of the stack
    public int peek() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack Underflow: Cannot peek, stack is empty.");
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(3); // Stack with max size of 3

        try {
            stack.push(10);  // Push 10
            stack.push(20);  // Push 20
            stack.push(30);  // Push 30

            // Uncomment the following line to test StackOverflowException
            // stack.push(40);  // This will throw StackOverflowException

            System.out.println("Top element is " + stack.peek());  // Peek the top element

            stack.pop();  // Pop an element
            stack.pop();  // Pop another element

            // Uncomment the following line to test StackUnderflowException
            // stack.pop();  // This will throw StackUnderflowException

        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
