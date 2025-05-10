package loops;

// Output:
// 1 2 3 4 5 6 7 8 9 10  = 55
// 10 9 8 7 6 5 4 3 2 1  = 55
// Sum using formula: 55
// 1 2 3 4 5 6 7 8 9 10  = 55
// 1 2 3 4 5 6 7 8 9 10  = 55

public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    int n = 10, sum = 0;

    // Method 1
    for (int i = 1; i <= n; i++) {
      sum += i;
      System.out.print( i + " " );
    }

    System.out.println(" = " + sum);

    // Method 2
    // Resetting sum
    sum = 0;

    for (int i = n; i >= 1; i--) {
      sum += i;
      System.out.print( i + " " );
    }

    System.out.println(" = " + sum);

    // Method 3
    // Resetting sum
    sum = 0;

    sum = (n * (n + 1)) / 2;
    System.out.println("Sum using formula: " + sum);

    // Method 4: Using a while loop
    // Resetting sum
    sum = 0;
    int i = 1;

    while (i <= n) {
      sum += i;
      System.out.print(i + " ");
      i++;
    }

    System.out.println(" = " + sum);

    // Method 5: Using a do-while loop
    // Resetting sum and i
    sum = 0;
    i = 1;

    do {
      sum += i;
      System.out.print(i + " ");
      i++;
    } while (i <= n);
    
    System.out.println(" = " + sum);
  }
}
