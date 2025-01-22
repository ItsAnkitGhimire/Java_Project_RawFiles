import java.util.Scanner;

public class Variable {
    static int firstNumber, secondNumber;
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (true) {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("0.Exit");

            int choice = in.nextInt();

            // Exit condition before taking numbers
            if (choice == 0) {
                break;
            }

            System.out.println("Enter any two numbers:");
            firstNumber = in.nextInt();
            secondNumber = in.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    sub();
                    break;

                case 3:
                    mul();
                    break;

                case 4:
                    div();
                    break;

                default:
                    System.out.println("INVALID");
            }
        }
        in.close(); // Close the scanner to free resources
    }

    public static void add() {
        System.out.println("Addition: " + (firstNumber + secondNumber));
    }

    public static void sub() {
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
    }

    public static void mul() {
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
    }

    public static void div() {
        if (secondNumber != 0) {
            System.out.println("Division: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
