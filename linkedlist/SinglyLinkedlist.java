package linkedlist;

public class SinglyLinkedlist {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    public SinglyLinkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // insert at position
    public void insertAtPosition(int data, int position) {
       if(position < 0 || position >size){
            System.out.println("Invalid position");
            return;

       }
       if(position == 0){
            insertAtHead(data);
            return;
       }
       if(position == size){
            insertAtTail(data);
            return;
       }

       Node prevNode = head;

       for(int i=0; i<position-2; i++){
           prevNode = prevNode.next;
       }

       Node newNode = new Node(data);
       newNode.next = prevNode.next;
       prevNode.next = newNode;

       size++;

    }
    
    // traversal
    public void printList(){
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        
        System.out.println();

    }

    // utility functions
    
    public int getSize (){
            return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getHead(){

        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        else{
            return head.data;
        }
    }

    public int getTail(){

        
        if(tail == null){
            System.out.println("List is empty");
            return -1;
        }
        else{
            return tail.data;
        }
    }

    // searching
    
    public boolean searchInList(int target){
        
        Node temp = head;
        int position = 1;
        while( temp != null){

            if(temp.data == target){
                System.out.println("Element found in the list: " + target + " at position: " + position);
                return true;
            }
           
            position++;
            temp = temp.next;
            
        }
        System.out.println("Element not found in the list");
        return false;

    }

    //deletion
    // delete head
    public void deleteHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }

    // delete tail
    public void deleteTail(){
        
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // delete at position
    public void deleteAtPosition(int position){
        if(position < 0 || position >= size){
            System.out.println("Invalid position");
            return;
        }
        if(position == 0){
            deleteHead();
            return;
        }
        if(position == size - 1){
            deleteTail();
            return;
        }

        Node prevNode = head;
        for(int i=0; i<position-1; i++){
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
    }




    public static void main(String[] args) {
        
        SinglyLinkedlist myList = new SinglyLinkedlist();

        if(myList.isEmpty()){
            System.out.println("List is empty");
        }
        System.out.println("Size of the list: " + myList.getSize());
        
        myList.insertAtHead(10);
        myList.printList();

        myList.insertAtHead(20);
        myList.printList();

        myList.insertAtTail(30);
        myList.printList();

        myList.insertAtPosition(25, 2);
        myList.printList();

        System.out.println("Size of the list: " + myList.getSize());

        System.out.println("Head of the list: " + myList.getHead());

        System.out.println("Tail of the list: " + myList.getTail());

        myList.searchInList(25);

        myList.deleteAtPosition(2);
        myList.printList();

        myList.deleteHead();
        myList.printList();

        myList.deleteTail();
        myList.printList();
    }
       
}
