package practiceproject6;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SortedCircularLinkedList {
    Node head;

    SortedCircularLinkedList() {
        this.head = null;
    }
    void insert(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else if (newData < head.data) {
            
            newNode.next = head;
            Node last = getLastNode();
            last.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head && newData > current.next.data) {
                current = current.next;
            }
            
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    Node getLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }
}

public class InsertSortedCircularList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedCircularLinkedList circularList = new SortedCircularLinkedList();

        circularList.insert(3);
        circularList.insert(8);
        circularList.insert(12);
        circularList.insert(15);

        System.out.println("Sorted Circular Linked List:");
        circularList.display();

	}

}
