package loops;

// Output:
// 5! = 120
// 5! = 120
// 5! = 120

public class FactorialCalculator {
  public static void main(String[] args) {
    int num = 5, result = num;


    // Method 1
    for( int i = num - 1; i >= 1; i-- ) {
      result *= i;
    }

    System.out.println( num + "! = " + result);


    // Method 2
    // reset
    result = 1;
    int i = 1;

    while (i <= num) {
      result *= i;
      i++;
    }

    System.out.println(num + "! = " + result);

    // Method 3
    result = 1;
    i = 1;

    do {
      result *= i;
      i++;
    } while (i <= num);

    System.out.println(num + "! = " + result);
  }
}
