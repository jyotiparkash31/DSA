class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode mhead=mid.next;
        mid.next=null;
        mhead=rev(mhead);
        ListNode c1=head;
        ListNode c2=mhead;
        boolean res=true;
        while(c1!=null & c2!=null){
            if(c1.val!=c2.val)res=false;
            c1=c1.next;
            c2=c2.next;
        }
        mhead=rev(mhead);
        mid.next=mhead;
        return res;
    }
    public ListNode middle(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     public ListNode rev(ListNode head){
         if(head==null || head.next==null)return head;
         ListNode prev=null;
         ListNode curr=head;
         ListNode forw=null;
         while(curr!=null){
             forw=curr.next;
             curr.next=prev;
             prev=curr;
             curr=forw;
         }
         return prev;
     }
}