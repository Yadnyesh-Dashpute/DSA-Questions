public class zigzagll {
    

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
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
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


        public Node findMid(Node head){

            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }

            return slow;

        }

        public void zigzag(){
            if(head == null || head.next == null){
                return;
            }
            //Find MidNode
            Node midNode = findMid(head);

            //reverse 2nd half

            Node curr = midNode.next;
            midNode.next = null;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node left = head;
            Node right = prev;

            //Alt merge 

            Node nextL;
            Node nextR;

            while(left != null && right != null){

                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;

            }
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
         
             public static void main(String[] args) {
                //  palindrome ll = new palindrome();
                 
                zigzagll ll = new zigzagll();
                ll.addLast(1);
                ll.addLast(2);
                ll.addLast(3);
                ll.addLast(4);
                ll.addLast(5);
                ll.addLast(6);

                ll.print();
                ll.zigzag();
                ll.print();






        // System.out.println(ll.checkPalindrome());

    }

    

}
