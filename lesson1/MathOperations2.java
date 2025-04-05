public class MathOperations2 {
  public static void main(String[] args) {
      // Integer Math
      int a = 15, b = 4;
      System.out.println("Addition: " + (a + b));
      System.out.println("Floor Division: " + Math.floorDiv(a, b));
      System.out.println("Modulus: " + (a % b));

      // Floating Point Math
      double x = 10.5, y = 2.3;
      System.out.println("\nMultiplication: " + (x * y));
      System.out.println("Division: " + (x / y));

      // Rounding
      double val = 5.7;
      System.out.println("\nCeil: " + Math.ceil(val));
      System.out.println("Floor: " + Math.floor(val));
      System.out.println("Round: " + Math.round(val));

      // Min, Max, Abs
      System.out.println("\nMin: " + Math.min(10, 20));
      System.out.println("Max: " + Math.max(10, 20));
      System.out.println("Abs: " + Math.abs(-25));

      // Random
      System.out.println("\nRandom: " + Math.random());

      // Exponential & Logarithmic
      System.out.println("\nexp(1): " + Math.exp(1));
      System.out.println("log(10): " + Math.log(10));
      System.out.println("log10(1000): " + Math.log10(1000));
      System.out.println("pow(2, 3): " + Math.pow(2, 3));
      System.out.println("sqrt(16): " + Math.sqrt(16));

      // Trigonometry
      double radians = Math.toRadians(30);
      System.out.println("\nsin(30°): " + Math.sin(radians));
      System.out.println("cos(30°): " + Math.cos(radians));
      System.out.println("tan(30°): " + Math.tan(radians));
      System.out.println("asin(0.5): " + Math.toDegrees(Math.asin(0.5)));
      System.out.println("acos(0.5): " + Math.toDegrees(Math.acos(0.5)));
      System.out.println("atan(1): " + Math.toDegrees(Math.atan(1)));
      System.out.println("atan2(1, 1): " + Math.toDegrees(Math.atan2(1, 1)));

      // Hyperbolic and Conversion
      System.out.println("\nsinh(1): " + Math.sinh(1));
      System.out.println("cosh(1): " + Math.cosh(1));
      System.out.println("tanh(1): " + Math.tanh(1));
      System.out.println("toDegrees(PI): " + Math.toDegrees(Math.PI));
      System.out.println("toRadians(180): " + Math.toRadians(180));

      // Constants
      System.out.println("\nPI: " + Math.PI);
  }
}
