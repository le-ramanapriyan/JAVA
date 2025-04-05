import java.util.Arrays;
import java.util.List;

public class Loops {
  public static void main(String[] args) {

      // 1. for loop
      System.out.println("For Loop:");
      for (int i = 1; i <= 3; i++) {
          System.out.println("Count: " + i);
      }

      // 2. forEach loop
      System.out.println("\nForEach Loop:");
      int[] numbers = {10, 20, 30};
      for (int num : numbers) {
          System.out.println("Number: " + num);
      }

      List<Integer> arrnumbers = Arrays.asList(10, 20, 30);

      // Using forEach() with lambda
      System.out.println("forEach() Method:");
      arrnumbers.forEach(arrnum -> System.out.println("Number: " + arrnum));

      // 3. while loop
      System.out.println("\nWhile Loop:");
      int j = 1;
      while (j <= 3) {
          System.out.println("While Count: " + j);
          j++;
      }

      // 4. do...while loop
      System.out.println("\nDo-While Loop:");
      int k = 1;
      do {
          System.out.println("Do-While Count: " + k);
          k++;
      } while (k <= 3);
  }
}
