package fundamentals;

// Output:
// b is greater than a
// Sorted Array: 10 20 30 40 50 
// Largest: 50

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


    int arr[] = { 10, 20, 30, 40, 50 };

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // Print sorted array
    System.out.print("Sorted Array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    System.out.println("\nLargest: " + arr[arr.length - 1]);
  }
}
