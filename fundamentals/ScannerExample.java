package fundamentals;

// Output:
// Enter your name: ramanapriyan
// Enter your age: 21
// Hello, ramanapriyan. You are 21 years old.

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Hello, " + name + ". You are " + age + " years old.");
  }
}
