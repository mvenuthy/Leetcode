class Solution {
          
     // Iterative Reverse solution
      public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode current = head;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current; 
            current = temp;
        }
        return prev;
    }
}
