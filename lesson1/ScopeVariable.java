public class ScopeVariable {
    
    // Class variable (static scope)
    static int classCounter = 0;

    // Instance variable
    String instanceName;

    // Constructor with parameter (parameter scope)
    public ScopeVariable(String name) {
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
        ScopeVariable obj1 = new ScopeVariable("Alice");
        ScopeVariable obj2 = new ScopeVariable("Bob");

        obj1.showScope();
        obj2.showScope();

        classCounter++;  // Accessing static variable
    }
}
