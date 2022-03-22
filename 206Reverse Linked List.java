class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode forward=head.next;
        head.next=null;
        while(forward!=null){
            ListNode temp=forward.next;
            forward.next=head;
            // System.out.print(head);
            head=forward;
            forward=temp;   
        }
        return head;
    }
}