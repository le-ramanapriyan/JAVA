package fundamentals;

// Output:
// 5 is positive

public class PositiveNegative {
  public static void main(String[] args) {
    int num = 5;

    if (num > 0) {
      System.out.println(num + " is positive");
    } else if (num < 0) {
      System.out.println(num + " is negative");
    } else {
      System.out.println(num + " is zero");
    }

    // Method2: Using a ternary operator
    String result = (num > 0) ? num + " is positive" : (num < 0) ? num + " is negative" : num + " is zero";
    System.out.println(result);
  }
}
