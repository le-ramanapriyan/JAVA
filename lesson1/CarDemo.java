public class CarDemo {

  // Main method
  public static void main(String[] args) {
      // Creating Car objects using both constructors
      Car car1 = new Car(); // uses default constructor
      Car car2 = new Car("Toyota", "Corolla", "Red");

      // Setting color using method
      car1.setColor("Blue");

      // Printing info
      car1.printInfo();
      car2.printInfo();

      // Using nested class
      Car.Engine engine = new Car.Engine();
      engine.printEngineType();
  }
}

// Main Car class
class Car {
  // Fields
  public String brand;
  public String model;
  public String color;

  // Default constructor
  public Car() {
      this.brand = "Unknown";
      this.model = "Unknown";
      this.color = "Unknown";
  }

  // Parameterized constructor
  public Car(String brand, String model, String color) {
      this.brand = brand;
      this.model = model;
      this.color = color;
  }

  // Method to set color
  public void setColor(String newColor) {
      this.color = newColor;
  }

  // Method to print car info
  public void printInfo() {
      System.out.println("Brand: " + brand + ", Model: " + model + ", Color: " + color);
  }

  // Static nested class
  public static class Engine {
      public void printEngineType() {
          System.out.println("Engine Type: V6");
      }
  }
}
