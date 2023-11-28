package practiceprojects;

public class CallMethods {
	// Method without parameters and without return value
    static void greet() {
        System.out.println("Hello!");
    }
    // Method with parameters and return value
    static int add(int a, int b) {
        return a + b;
    }
    // Method with a default parameter
    static void greetWithName(String name) {
        System.out.println("Hello, " + name + "!");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Calling a method without parameters
        greet();
        // Calling a method with parameters and capturing the return value
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);
        // Calling a method with a default parameter
        greetWithName("akash");
        // Calling a method using different ways to pass parameters
        displayInfo("rahul", 25);
        displayInfo("shreyas"); // This will use the default age value
    }
	// Method with default parameter
    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with a default parameter
    static void displayInfo(String name) {
        displayInfo(name, 30); // Default age value

	}

}
