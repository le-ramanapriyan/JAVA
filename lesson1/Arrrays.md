## Java Arrays - Full Example Guide

### 1. Java Arrays
```java
int[] numbers = {1, 2, 3, 4, 5};
```

### 2. Declaring an Array Variable in Java
```java
int[] scores;      // preferred
int scores[];      // also valid
```

### 3. Instantiating an Array in Java
```java
scores = new int[5]; // creates array with default values (0)
```

### 4. Java Array Literals
```java
int[] primes = {2, 3, 5, 7, 11};
```

### 5. Java Array Length Cannot Be Changed
```java
int[] fixed = new int[3];
// fixed.length = 5; // ❌ Not allowed: length is final
```

### 6. Accessing Java Array Elements
```java
System.out.println(primes[2]); // prints 5
```

### 7. Array Length
```java
System.out.println(primes.length); // prints 5
```

### 8. Iterating Arrays
```java
for (int num : primes) {
    System.out.print(num + " ");
}
```

### 9. Multidimensional Java Arrays
```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

### 10. Iterating Multidimensional Arrays
```java
for (int[] row : matrix) {
    for (int val : row) {
        System.out.print(val + " ");
    }
}
```

### 11. Inserting Elements Into an Array
```java
int[] arr = new int[5];
arr[2] = 99; // insert at index 2
```

### 12. Removing Elements From an Array
```java
int[] original = {1, 2, 3, 4};
int[] updated = new int[3];
for (int i = 0, j = 0; i < original.length; i++) {
    if (i != 2) updated[j++] = original[i]; // skip index 2
}
```

### 13. Finding Min and Max Value in Arrays
```java
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for (int n : primes) {
    if (n < min) min = n;
    if (n > max) max = n;
}
```

### 14. The Arrays Class
```java
import java.util.Arrays;
int[] sorted = {3, 1, 2};
Arrays.sort(sorted);
```

### 15. Copying Arrays
```java
int[] copy = Arrays.copyOf(primes, primes.length);
```

### 16. Copying an Array by Iterating the Array
```java
int[] copy = new int[primes.length];
for (int i = 0; i < primes.length; i++) {
    copy[i] = primes[i];
}
```

### 17. Copying an Array Using Arrays.copyOf()
```java
int[] copied = Arrays.copyOf(primes, 3); // copy first 3
```

### 18. Copying an Array Using Arrays.copyOfRange()
```java
int[] range = Arrays.copyOfRange(primes, 1, 4); // index 1 to 3
```

### 19. Converting Arrays to Strings With Arrays.toString()
```java
System.out.println(Arrays.toString(primes)); // [2, 3, 5, 7, 11]
```

### 20. Sorting Arrays
```java
int[] nums = {5, 2, 9};
Arrays.sort(nums); // nums = [2, 5, 9]
```

### 21. Sorting Arrays of Objects
```java
String[] names = {"Zoe", "Alex", "Bob"};
Arrays.sort(names); // Alphabetical order
```

### 22. Filling Arrays With Arrays.fill()
```java
int[] filled = new int[4];
Arrays.fill(filled, 7); // [7, 7, 7, 7]
```

### 23. Searching Arrays with Arrays.binarySearch()
```java
int[] data = {1, 3, 5, 7, 9};
int index = Arrays.binarySearch(data, 5); // returns 2
```

### 24. Checking if Arrays are Equal with Arrays.equals()
```java
int[] a = {1, 2};
int[] b = {1, 2};
System.out.println(Arrays.equals(a, b)); // true
```

### 25. Accessing an Array via Reflection
```java
import java.lang.reflect.Array;
int[] values = {10, 20, 30};
int second = (int) Array.get(values, 1);
System.out.println(second); // 20