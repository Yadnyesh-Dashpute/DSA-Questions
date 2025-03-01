https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If we need to remove the first node
        if (n == sz) {
            return head.next;
        }

        int idx = sz - n;
        int i = 1;
        ListNode prev = head;

        // Traverse to the (sz-n)th node
        while (i < idx) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;
    }
}
