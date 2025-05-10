package arrays;

// Output:
// Number of even numbers: 3
// Number of odd numbers: 2

public class CountEvenOdd {
  public static void main(String[] args) {
    int arr[] = { 10, 15, 50, 305, 400 };
    int evenCount = 0;
    int oddCount = 0;

    for (int num : arr) {
      if (num % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }

    System.out.println("Number of even numbers: " + evenCount);
    System.out.println("Number of odd numbers: " + oddCount);
  }
}
