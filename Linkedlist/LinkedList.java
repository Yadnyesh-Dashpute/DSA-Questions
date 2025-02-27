public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        //Step 1 - Create a New Node

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;

        }

        //Step 2 - Assign the Head To Next of newNode
        
        newNode.next = head;

        //Step 3 - Head = new Node

        head = newNode;

    }

    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;

    }

    public void print(){   

        if(head == null){
            System.out.println("Null");
            return;
        }
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

/*   
    
    public int removeFirst(){

        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

*/

public void insertMiddle(int idx, int data){
    int i = 0;
    Node newNode = new Node(data);
    Node temp = head;
    while (i < idx - 1 ){
        temp = temp.next;
        i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}
 
public static void main(String[] args) {

    LinkedList ll = new LinkedList();

    ll.print();

    ll.addFirst(2);
    ll.print();

    ll.addFirst(1);
    ll.print();

    ll.addLast(3);
    ll.print();

    ll.addLast(4);
    ll.print();

    System.out.println("After Middle Operation: ");
    ll.insertMiddle(3, 10);
    ll.print();



    
   
}
}