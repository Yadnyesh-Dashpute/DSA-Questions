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
    public static int size;

    public void addFirst(int data){

        //Step 1 - Create a New Node

        Node newNode = new Node(data);
        size++;
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
        size++;
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

    
    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        
        for(int i = 0 ; i < size-2; i++){
            prev = prev.next;
        }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;


        return val;
    }



public void add(int idx, int data){
    if (idx == 0){
        addFirst(data);
        return;
    }
    int i = 0;
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    while (i < idx - 1 ){
        temp = temp.next;
        i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}


public int iterativeSearch(int key){

    Node temp = head;
    int i = 0;

    while (temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }

    return -1;
    
}

public int helper(Node head, int key){

    if(head == null){
        return -1;
    }

    if(head.data == key){
        return 0;
    }

    int idx = helper(head.next, key);

    if(idx == -1){
        return -1;
    }

    return idx+1;
    
}
public int recursiveSearch(int key){
    return helper(head, key);
}

public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
}


public void deleteNthfromEnd(int n){

    int sz = 0;

    Node temp = head;

    while(temp != null){
        temp = temp.next;
        sz++;
    }

    if(n == sz) {
        head = head.next; // Delete First
        return;
    }

    int i = 1;
    int itofind = sz-n;

    Node prev = head;

    while (i < itofind){
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;
    return;

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
    ll.add(3, 10);
    ll.print();

    System.out.println(size);

    ll.removeFirst();
    ll.print();
    System.out.println(size);

    ll.removeLast();
    ll.print();
    System.out.println(size);

    System.out.println("Key Found! At Index:"+ll.iterativeSearch(10));
    System.out.println(ll.recursiveSearch(10));


    ll.deleteNthfromEnd(1);
    ll.print();

    ll.reverse();
    ll.print();

    
   
}
}