public class Conditions {
  public static void main(String[] args) {
      int number = 15;

      if (number > 20) {
          System.out.println("Greater than 20");
      } else if (number == 20) {
          System.out.println("Equal to 20");
      } else {
          System.out.println("Less than 20");
      }

      // Ternary operator
      String result = (number % 2 == 0) ? "Even" : "Odd";
      System.out.println("The number is " + result);

      // Switch example
      int day = 3;
      switch (day) {
          case 1: System.out.println("Monday"); break;
          case 2: System.out.println("Tuesday"); break;
          case 3: System.out.println("Wednesday"); break;
          default: System.out.println("Other day");
      }
  }
}
