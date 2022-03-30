class Solution {
    public int pairSum(ListNode head) {
         // if(head==null || head.next==null)return 0;
        ListNode md=mid(head);
        ListNode nhead=md.next;
        md.next=null;
        ListNode rev= reverse(nhead);
        int sum=0;
        while(head!=null && rev!=null){
            int ans=head.val+rev.val;
            sum=Math.max(sum,ans);
            head=head.next;
            rev=rev.next;
        }
        return sum;
    }
    public ListNode mid(ListNode head){
         if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}