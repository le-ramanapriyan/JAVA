package fundamentals;

// Output:
// 10 is even

public class OddEven {
  public static void main(String[] args) {
    int n = 10;

    // Check if the number is even or odd using modulus operator
    if (n % 2 == 0) {
      System.out.println(n + " is even");
    } else {
      System.out.println(n + " is odd");
    }

    // Alternative method using bitwise AND operator
    if ((n & 1) == 0) {
      System.out.println(n + " is even");
    } else {
      System.out.println(n + " is odd");
    }

    // Using ternary operator
    System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
  }
}
