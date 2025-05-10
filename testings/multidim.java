public class multidim {
  public static void main(String... args) {
    int[][] dim = new int[3][6];

    // Fill the array with random numbers from 0 to 9
    for (int i = 0; i < dim.length; i++) {
      for (int j = 0; j < dim[i].length; j++) {
        dim[i][j] = (int) (Math.random() * 10);
      }
    }

    // Print using regular for loop
    System.out.println("Printing using regular for loop:");
    for (int i = 0; i < dim.length; i++) {
      for (int j = 0; j < dim[i].length; j++) {
        System.out.print(dim[i][j] + " ");
      }
      System.out.println();
    }

    // Print using enhanced for-each loop
    System.out.println("\nPrinting using enhanced for-each loop:");
    for (int[] row : dim) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}
