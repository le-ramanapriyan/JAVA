import java.util.Scanner;

public class Syntax {
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");

    Scanner scanner = new Scanner(System.in); // Create Scanner object

    // Taking different types of input
    System.out.print("Enter your name: ");
    String name = scanner.nextLine(); // Reads a full line of text

    System.out.print("Enter your age: ");
    int age = scanner.nextInt(); // Reads an integer

    // Display user input
    System.out.println("\nHello, " + name + "! You are " + age + " years old.");

    scanner.close(); // Close Scanner (to prevent resource leaks)
  }
}
