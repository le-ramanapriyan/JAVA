# Type Casting in Java

Type casting is converting one data type into another. Java provides two kinds of type casting:

## 1. Widening Casting (Implicit)

Automatically done when converting a smaller type to a larger type.

**Order of automatic widening:**

`byte → short → int → long → float → double`

**Example:**

```java
int num = 10;
double result = num;
System.out.println(result); // 10.0
```

## 2. Narrowing Casting (Explicit)

Manually done when converting a larger type to a smaller type.

**Example:**

```java
double pi = 3.14;
int approx = (int) pi;
System.out.println(approx); // 3
```

## Casting Objects

When dealing with class hierarchies:

- **Upcasting:** Subclass → Superclass (automatic)
- **Downcasting:** Superclass → Subclass (explicit)

**Example:**

```java
class Animal {}
class Dog extends Animal {
    void bark() { System.out.println("Woof"); }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();      // Upcast
        Dog d = (Dog) a;           // Downcast
        d.bark();                  // Woof
    }
}
```

## Summary

| Type      | Direction        | Automatic | Risk       |
| --------- | ---------------- | --------- | ---------- |
| Widening  | Smaller → Larger | Yes       | No         |
| Narrowing | Larger → Smaller | No        | Yes (loss) |

## Bonus Example (Both Types)

```java
public class TypeCastingExample {
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
```