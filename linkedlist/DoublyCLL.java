package linkedlist;

public class DoublyCLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyCLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Make it circular
            head.prev = tail; // Make it circular
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head; // Update tail's next to new head
            head.prev = tail; // Update head's prev to tail
        }
        size++;
    }

    // insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Make it circular
            head.prev = tail; // Make it circular
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head; // Update tail's next to head
            head.prev = tail; // Update head's prev to tail
        }
        size++;
    }

    // insert at position
    public void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
        size++;
    }
}
