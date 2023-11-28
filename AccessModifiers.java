package practiceprojects;


class simple {
    // Public field accessible from anywhere
    public int x = 10;
    // Protected field accessible within the same package and subclasses
    protected int y = 20;
    // Default  field accessible within the same package
    int z = 30;
    // Private field accessible only within the same class
    private int w = 40;
    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }
    // Protected method accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    // Default (package-private) method accessible within the same package
    void defaultMethod() {
        System.out.println("Default Method");
    }
    // Private method accessible only within the same class
    private void privateMethod() {
        System.out.println("Private Method");
    }
}

public class AccessModifiers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple obj1 = new simple();

	    // Accessing fields with different access modifiers
	    System.out.println("Public Field: " + obj1.x);
	    System.out.println("Protected Field: " + obj1.y);
	    System.out.println("Default Field: " + obj1.z);
	    
	    // Private field cannot be accessed outside the class
	    // System.out.println("Private Field: " + myObject.privateField);

	    // Accessing methods with different access modifiers
	    obj1.publicMethod();
	    obj1.protectedMethod();
	    obj1.defaultMethod();
	    
	    // Private method cannot be accessed outside the class
	    //obj1.privateMethod();

	}

}
