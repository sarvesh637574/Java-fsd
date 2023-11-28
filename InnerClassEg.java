package practiceprojects;


class OuterClass {
    private int outerVar = 10;

    // Inner class
    class InnerClassEg {
        void display() {
            System.out.println("Inner class method: " + outerVar);
        }
    }

    // Method to create and use the inner class
    void useInnerClassEg() {
        InnerClassEg innerObj = new InnerClassEg();
        innerObj.display();
    }
}
public class InnerClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Create an instance of the outer class
	        OuterClass outerObj = new OuterClass();

	        // Call the method to use the inner class
	        outerObj.useInnerClassEg();

	}
}

