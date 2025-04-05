public class TypeCasting {
  public static void main(String[] args) {
      // Widening
      int intVal = 42;
      double doubleVal = intVal;
      System.out.println("Widened double: " + doubleVal);

      // Narrowing
      double pi = 3.14159;
      int approx = (int) pi;
      System.out.println("Narrowed int: " + approx);
  }
}
