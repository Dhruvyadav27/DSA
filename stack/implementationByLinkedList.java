package stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
       
    }
}
class MyStack{
   Node head; 
   int len;
   int peek(){
         if(head == null){
              System.out.println("Stack is empty");
              return -1;
         }
         return head.val;
   }
   int pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int val = head.val;
        head = head.next;
        len--;
        return val;
   }
    void push(int val){
          Node newNode = new Node(val);
          newNode.next = head;
          head = newNode;
          len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class implementationByLinkedList {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.print("Stack elements: ");
        stack.display();
    }
}
