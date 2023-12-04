package practiceproject7;
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}


public class TraverseDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
        list.insert(3);
        list.insert(7);
        list.insert(10);
        list.insert(5);

        System.out.println("Forward traversal:");
        list.traverseForward();

        System.out.println("Backward traversal:");
        list.traverseBackward();

	}

}
