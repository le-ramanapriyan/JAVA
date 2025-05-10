package loops;

// Output:
// 15351 is a palindrome.

public class PalindromeCheck {
  public static void main(String[] args) {
    int number = 15351, reversedNumber = 0;

    for (int i = number; i != 0; i /= 10) {
      int digit = i % 10;
      reversedNumber = reversedNumber * 10 + digit;
    }

    if (number == reversedNumber) {
      System.out.println(number + " is a palindrome.");
    } else {
      System.out.println(number + " is not a palindrome.");
    }
  }
}
