package fundamentals;

// Output:
// b is greater than a

public class FindLargestTwoNo {
  public static void main(String[] args) {
    int a = 10 , b = 20;
    
    if ( a > b ) {
      System.out.println("a is greater than b");
    } else if ( a < b ) {
      System.out.println("b is greater than a");
    } else {
      System.out.println("a and b are equal");
    }
  }
}
