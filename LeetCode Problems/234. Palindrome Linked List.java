/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        }
      return slow;
    }

    public boolean isPalindrome(ListNode head) {
        
        if(head == null && head.next == null){
            return true;
        }

        //Find Mid

        ListNode midNode = findMid(head);

        // Reverse LL

        
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

     while(curr != null){

        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

     }

    ListNode right = prev; //Right Head
    ListNode left = head;
     
    while (right != null) {
        if(left.val != right.val){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
    }
}
