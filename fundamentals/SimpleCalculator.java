package fundamentals;

// Output:
// Enter first number: 10
// Enter second number: 5
// Enter operation (+, -, *, /): +
// Result: 15

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter operation (+, -, *, /): ");
    String operation = scanner.next();

    switch (operation) {
      case "+":
        System.out.println("Result: " + (num1 + num2));
        break;
      case "-":
        System.out.println("Result: " + (num1 - num2));
        break;
      case "*":
        System.out.println("Result: " + (num1 * num2));
        break;
      case "/":
        if (num2 != 0) {
          System.out.println("Result: " + (num1 / num2));
        } else {
          System.out.println("Cannot divide by zero");
        }
        break;
      default:
        System.out.println("Invalid operation");
    }

    scanner.close();
  }
}
