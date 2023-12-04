package practiceproject9;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        // Inserting elements into the queue (enqueue)
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);

        // Displaying the queue
        System.out.println("Queue after enqueuing elements: " + queue);

        // Removing elements from the queue (dequeue)
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Displaying the queue after dequeuing an element
        System.out.println("Queue after dequeuing element: " + queue);

	}

}
