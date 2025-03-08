public class palindrome {
    

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
            Node fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow;
        }


        public boolean checkPalindrome() {

            if(head == null || head.next == null){
                return true;
            }

            // step 1 - find Middle
            Node midNode = findMid(head);

            // step 2 - reverse 2nd Half

            Node prev = null;
            Node curr = midNode;
            Node next;

            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr =next;
            }

            Node right = prev; //Right Half Head
            Node left = head;
            // step 3 - check left half and right half

            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
        
        return true;
            
        }

         public static boolean hasCycle() {
         
                 Node slow = head;
                 Node fast = head;
                 
                 while (fast != null && fast.next  != null){
         
                     slow = slow.next;
                     fast = fast.next.next;
         
                     if(slow == fast){
                         return true;
                     }
                 }
                 return false;
             }
         
         
                 public static void removeCycle(){
         
                     Node slow = head;
                     Node fast = head;
                     boolean cycle = false;
         
                     while(fast != null && fast.next != null){
         
                         slow = slow.next;
                         fast = fast.next.next;
         
                         if(fast == slow){
                             cycle = true;
                             break;
                         }
                     }
                     
                     if(cycle == false){
                         return;
                     }
         
                     slow = head;
                     Node prev = null;
         
                     while (slow != fast) {
                         prev = fast;
                         slow = slow.next;
                         fast = fast.next;
                     }
         
                     prev.next = null;
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
                 
                 head = new Node(1);
                 Node temp = new Node(2);
                 head.next = temp;
                 head.next.next = new Node(3);
                 head.next.next.next = temp;
                 
                 System.out.println(hasCycle());
                 removeCycle();
                 System.out.println(hasCycle());





        // System.out.println(ll.checkPalindrome());

    }

    

}
