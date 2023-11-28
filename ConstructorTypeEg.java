package practiceprojects;



public class ConstructorTypeEg {
	// Default Constructor
    public ConstructorTypeEg() {
        System.out.println("Default Constructor called.");
    }
    // Parameterized Constructor
    public ConstructorTypeEg(String message) {
        System.out.println("Parameterized Constructor called with message: " + message);
    }
    // Copy Constructor
    public ConstructorTypeEg(ConstructorTypeEg other) {
        System.out.println("Copy Constructor called. Copied message from another instance: " + other.getMessage());
    }
    // Getter method to retrieve a message
    public String getMessage() {
        return "Hello from ConstructorTypeEg!";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating instances using different constructors
        ConstructorTypeEg defaultConstructorObj = new ConstructorTypeEg();
        ConstructorTypeEg parameterizedConstructorObj = new ConstructorTypeEg("Hello, parameterized constructor!");
        ConstructorTypeEg originalObj = new ConstructorTypeEg("Original message");
        ConstructorTypeEg copyConstructorObj = new ConstructorTypeEg(originalObj);

        // Accessing a method to retrieve a message
        System.out.println("Message from originalObj: " + originalObj.getMessage());


	}

}
