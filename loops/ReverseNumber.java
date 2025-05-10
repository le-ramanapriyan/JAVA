package loops;

// Output:
// 54321
// 54321

public class ReverseNumber {
  public static void main(String[] args) {
    int number = 12345;
    int reversedNumber = 0;

    // Method 1: Using while loop 
    // Reverse the number 
    while (number != 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number /= 10;
    }

    System.out.println(reversedNumber);

    // Method 2: Using for loop
    // reset number
    number = 12345;
    reversedNumber = 0;

    for (int i = number; i != 0; i /= 10) {
      int digit = i % 10;
      reversedNumber = reversedNumber * 10 + digit;
    }

    System.out.println(reversedNumber);
  }
}
