# Java Variable Scope – All-in-One Example

This example demonstrates all major types of variable scopes in Java:

- **Class/Static Scope**
- **Instance Scope**
- **Local Scope**
- **Block Scope**
- **Parameter Scope**

---

## ✅ Example Code

```java
public class ScopeExample {

    // 📘 Scope Summary
    // Scope Type      | Declared In                  | Accessible In
    // ---------------------------------------------------------------
    // Class (Static)  | Class body with static       | All static and non-static methods
    // Instance        | Class body (non-static)      | All non-static methods
    // Local           | Inside a method              | Only inside that method
    // Block           | Inside a block {}            | Only inside that block
    // Parameter       | Method/constructor arguments | Only inside that method/constructor

    // Class variable (static scope)
    static int classCounter = 0;

    // Instance variable
    String instanceName;

    // Constructor with parameter (parameter scope)
    public ScopeExample(String name) {
        this.instanceName = name;  // 'name' is a parameter
    }

    public void showScope() {
        // Local variable
        int localVar = 10;

        System.out.println("Instance Name: " + instanceName);
        System.out.println("Local Variable: " + localVar);
        System.out.println("Class Counter: " + classCounter);

        // Block scope
        if (localVar > 5) {
            int blockVar = 20;  // Only accessible inside this block
            System.out.println("Block Variable: " + blockVar);
        }

        // Uncommenting below will cause an error (blockVar not visible)
        // System.out.println(blockVar);
    }

    public static void main(String[] args) {
        ScopeExample obj1 = new ScopeExample("Alice");
        ScopeExample obj2 = new ScopeExample("Bob");

        obj1.showScope();
        obj2.showScope();

        classCounter++;  // Accessing static variable
    }
}
