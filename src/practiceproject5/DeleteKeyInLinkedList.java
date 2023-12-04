package practiceproject5;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to delete the first occurrence of a key in the linked list
    void delete(int key) {
        Node temp = head;
        Node prev = null;

        // If key is in the head node
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key is not present in the linked list
        if (temp == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node containing the key
        prev.next = temp.next;
    }
}

public class DeleteKeyInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();

        // Insert some nodes into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Original linked list:");
        linkedList.display();

        int keyToDelete = 3;
        linkedList.delete(keyToDelete);

        System.out.println("Linked list after deleting the first occurrence of key " + keyToDelete + ":");
        linkedList.display();

	}

}
