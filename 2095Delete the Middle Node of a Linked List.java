class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // if(head==null)return head;
        // if(head.next==null)return null;
        // ListNode pslow=head;
        ListNode dummy=new ListNode(-1);//we take dummy node to avoid null pointer exception
        ListNode pslow=dummy;
        pslow.next=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            pslow=slow;
            slow=slow.next;
        }
        pslow.next=slow.next;
        return dummy.next;
    }
}