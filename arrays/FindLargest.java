package arrays;

// Output:
// Smallest Number in this array: 10
// Largest Number in this array: 400

public class FindLargest {
  public static void main(String[] args) {
    int arr[] = { 15, 400, 50, 305, 10 };
    int smallest = arr[0];
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    System.out.println("Smallest Number in this array: " + smallest);
    System.out.println("Largest Number in this array: " + largest);
  }
}
