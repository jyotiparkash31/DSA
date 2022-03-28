//appel interview question
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=head,prev=dummy;
        while(curr!=null &&curr.next!=null){
            prev.next=curr.next;
            ListNode fwd=curr.next.next;
            curr.next.next=curr;
            prev=curr;
            curr=fwd;
             
        }
         prev.next=curr;
        return dummy.next;
        
    }
}