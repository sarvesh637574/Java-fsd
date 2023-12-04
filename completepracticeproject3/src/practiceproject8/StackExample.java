package practiceproject8;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Inserting elements into the stack (push)
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Displaying the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Removing elements from the stack (pop)
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Displaying the stack after popping an element
        System.out.println("Stack after popping element: " + stack);

	}

}
