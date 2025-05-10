package loops;

// Output:
// Right Triangle:
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// Inverted Right Triangle:
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
// Left Triangle::
//           * 
//         * * 
//       * * * 
//     * * * * 
//   * * * * * 
// Inverted Left Triangle:
//   * * * * * 
//     * * * * 
//       * * * 
//         * * 
//           * 
// Pyramid:
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
// Diamond:
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 

public class StarPatterns {
  public static void main(String[] args) {

    int n = 5;

    // Right Triangle
    System.out.println("Right Triangle:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Inverted Right Triangle
    System.out.println("Inverted Right Triangle:");
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Left Triangle
    System.out.println("Left Triangle::");
    for (int i = 1; i <= n; i++) {
      for (int k = n; k >= i; k-- ) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Inverted Left Triangle
    System.out.println("Inverted Left Triangle:");
    for (int i = n; i >= 1; i--) {
      for (int k = n; k >= i; k-- ) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Pyramid
    System.out.println("Pyramid:");
    for (int i = 1; i <= n; i++) {
      for (int k = n; k >= i; k-- ) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Diamond
    System.out.println("Diamond:");
    for (int i = 1; i <= n; i++) {
      for (int k = n; k >= i; k-- ) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      for (int k = n; k >= i; k-- ) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
