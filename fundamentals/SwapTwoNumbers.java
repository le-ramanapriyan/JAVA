package fundamentals;

// Output:
// a: 10, b: 20
// a : 20, b : 10
// a : 10, b : 20
// a: 20, b: 10

public class SwapTwoNumbers {
  public static void main(String[] args) {
    int a = 20, b = 10;

    // Using a temporary variable
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a: " + a + ", b: " + b);

    // Swapping two numbers without using a third variable
    b = b + a;
    a = b - a;
    b = b - a;
    System.out.println("a : " + a + ", b : " + b);

    // Using multiplication and division
    b = b * a;
    a = b / a;
    b = b / a;
    System.out.println("a : " + a + ", b : " + b);

    // Using bitwise XOR operator
    b = b ^ a;
    a = b ^ a;
    b = b ^ a;
    System.out.println("a: " + a + ", b: " + b);
  }
}
