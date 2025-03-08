public class mergeLL {
    public Node mergeSort(Node head){
        
        //Find Mid
        if(head == null && head.next!=null){
            return head;
        }
        
        Node mid = getMid();
        //Left and Right Half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //Merge

        return  merge(newLeft, newRight);
    }    
}
