package arrays;

// Output:
// 30 20 150 10

public class ReverseArray {
  public static void main(String[] args) {
    int arr[] = { 10, 150, 20, 30 };

    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
