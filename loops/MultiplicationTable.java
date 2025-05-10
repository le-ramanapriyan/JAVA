package loops;

// Output:
// 1 * 5 = 5
// 2 * 5 = 10
// 3 * 5 = 15
// 4 * 5 = 20
// 5 * 5 = 25
// 6 * 5 = 30
// 7 * 5 = 35
// 8 * 5 = 40
// 9 * 5 = 45
// 10 * 5 = 50

public class MultiplicationTable {
  public static void main(String[] args) {
    int table = 5, rows = 10;

    // Print the multiplication table for the given number
    for (int i = 1; i <= rows; i++) {
      System.out.println(i + " * " + table + " = " + (i * table));
    }
  }
}
