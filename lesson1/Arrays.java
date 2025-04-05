public class Arrays {
  public static void main(String[] args) {
      // 1. Java Arrays
      int[] numbers = {1, 2, 3, 4, 5};

      // 2. Declaring an Array Variable in Java
      int[] scores;
      int scoresAlt[];

      // 3. Instantiating an Array in Java
      scores = new int[5];

      // 4. Java Array Literals
      int[] primes = {2, 3, 5, 7, 11};

      // 5. Java Array Length Cannot Be Changed
      int[] fixed = new int[3];
      // fixed.length = 5; // Not allowed

      // 6. Accessing Java Array Elements
      System.out.println(primes[2]);

      // 7. Array Length
      System.out.println(primes.length);

      // 8. Iterating Arrays
      for (int num : primes) {
          System.out.print(num + " ");
      }
      System.out.println();

      // 9. Multidimensional Java Arrays
      int[][] matrix = {
          {1, 2},
          {3, 4}
      };

      // 10. Iterating Multidimensional Arrays
      for (int[] row : matrix) {
          for (int val : row) {
              System.out.print(val + " ");
          }
      }
      System.out.println();

      // 11. Inserting Elements Into an Array
      int[] arr = new int[5];
      arr[2] = 99;

      // 12. Removing Elements From an Array
      int[] original = {1, 2, 3, 4};
      int[] updated = new int[3];
      for (int i = 0, j = 0; i < original.length; i++) {
          if (i != 2) updated[j++] = original[i];
      }

      // 13. Finding Min and Max Value in Arrays
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int n : primes) {
          if (n < min) min = n;
          if (n > max) max = n;
      }
      System.out.println("Min: " + min + ", Max: " + max);

      // 14. The Arrays Class
      java.util.Arrays.sort(arr);

      // 15. Copying Arrays
      int[] copy = java.util.Arrays.copyOf(primes, primes.length);

      // 16. Copying an Array by Iterating the Array
      int[] copy2 = new int[primes.length];
      for (int i = 0; i < primes.length; i++) {
          copy2[i] = primes[i];
      }

      // 17. Copying an Array Using Arrays.copyOf()
      int[] copied = java.util.Arrays.copyOf(primes, 3);

      // 18. Copying an Array Using Arrays.copyOfRange()
      int[] range = java.util.Arrays.copyOfRange(primes, 1, 4);

      // 19. Converting Arrays to Strings With Arrays.toString()
      System.out.println(java.util.Arrays.toString(primes));

      // 20. Sorting Arrays
      int[] nums = {5, 2, 9};
      java.util.Arrays.sort(nums);

      // 21. Sorting Arrays of Objects
      String[] names = {"Zoe", "Alex", "Bob"};
      java.util.Arrays.sort(names);

      // 22. Filling Arrays With Arrays.fill()
      int[] filled = new int[4];
      java.util.Arrays.fill(filled, 7);

      // 23. Searching Arrays with Arrays.binarySearch()
      int[] data = {1, 3, 5, 7, 9};
      int index = java.util.Arrays.binarySearch(data, 5);
      System.out.println("Index of 5: " + index);

      // 24. Checking if Arrays are Equal with Arrays.equals()
      int[] a = {1, 2};
      int[] b = {1, 2};
      System.out.println(java.util.Arrays.equals(a, b));

      // 25. Accessing an Array via Reflection
      int[] values = {10, 20, 30};
      int second = (int) java.lang.reflect.Array.get(values, 1);
      System.out.println("Second element: " + second);
  }
}
