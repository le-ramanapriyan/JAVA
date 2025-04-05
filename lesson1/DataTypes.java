import java.util.Arrays;

public class DataTypes {
  public static void main(String[] args) {
    // Primitive Data Types
    byte smallNumber = 10;
    short shortNumber = 2000;
    int intNumber = 50000;
    long longNumber = 1000000000L;
    float floatNumber = 5.75f;
    double doubleNumber = 19.99;
    boolean isJavaFun = true;
    char grade = 'A';

    // Non-Primitive Data Types
    String message = "Hello, Java!";
    int[] numbers = { 10, 20, 30, 40, 50 }; // Array
    Person person = new Person("Ramanapriyan", 21); // Class object

    // Output
    System.out.println("Primitive Data Types:");
    System.out.println("byte: " + smallNumber);
    System.out.println("short: " + shortNumber);
    System.out.println("int: " + intNumber);
    System.out.println("long: " + longNumber);
    System.out.println("float: " + floatNumber);
    System.out.println("double: " + doubleNumber);
    System.out.println("boolean: " + isJavaFun);
    System.out.println("char: " + grade);

    System.out.println("\nNon-Primitive Data Types:");
    System.out.println("String: " + message);
    System.out.println("Array: " + Arrays.toString(numbers));
    System.out.println("Person Object: " + person.getName() + " (Age: " + person.getAge() + ")");
  }
}

// Custom class (Non-Primitive)
class Person {
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
