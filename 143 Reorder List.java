class Solution {
    public void reorderList(ListNode head) {
        ListNode md=mid(head);//tail of the 1st half
        ListNode nhead=md.next;//head of the 2nd part
        md.next=null;//making tail null pointer
        nhead=Reverse(nhead);//reversing the 2nd part
        Merge(head,nhead);
        
       
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
      public ListNode Reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        
        while (curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    public ListNode Merge(ListNode head1, ListNode head2)
    {
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        
        while (curr1 != null && curr2 != null)
        {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = next1;
            
            curr1 = next1;
            curr2 = next2;
        }
        
        return head1;
    }
}