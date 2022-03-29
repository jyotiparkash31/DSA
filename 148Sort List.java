class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode one=mid(head);
        ListNode nHead=one.next;
        one.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(nHead);
        
         return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
         ListNode curr=new ListNode();
        ListNode tail=curr;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
         tail=tail.next;
        }
         tail.next=l1!=null?l1:l2;
       
        return curr.next;
    }
    public ListNode mid(ListNode head){
         if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while( fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}