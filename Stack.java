import java.util.Scanner;

public class Stack {
    int stack[];  // Array to store stack elements
    int top;      // Tracks the top element in the stack
    int size;     // Maximum size of the stack

    // Constructor to initialize stack properties
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // Initially, the stack is empty
    }

    // Push operation: Adds an element to the stack
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Pop operation: Removes the top element from the stack
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println("Popped " + stack[top--] + " from the stack.");
        }
    }

    // Display method: Prints all elements in the stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method: Drives the program with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size); // Create a stack object

        int choice; // Variable to store user choice
        do {
            // Displaying menu options
            System.out.println("\nSTACK OPERATIONS USING ARRAY");
            System.out.println("-----------------------------");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Reading user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt(); // Value to be pushed
                    stack.push(value); // Call push method
                    break;
                case 2:
                    stack.pop(); // Call pop method
                    break;
                case 3:
                    stack.display(); // Call display method
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4); // Loop until user selects exit

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
