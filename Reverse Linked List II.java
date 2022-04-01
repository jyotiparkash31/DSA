//This solution is based on the logic that reverse the portion given in question and then point the node to right node by keeping the backup of the node
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)return head;
       
        ListNode dummy =new ListNode(-1);
        dummy.next=head;
        ListNode prev=null;
        ListNode nodel=dummy;
        for(int i=0;i<left;i++){
            prev=nodel;
            nodel=nodel.next;
        }
        ListNode prev1=prev;//backup
        ListNode curr=nodel;//backup
        ListNode fwd;
        for(int i=left;i<=right;i++){
            fwd=curr.next;//backup node
            curr.next=prev1;
            prev1=curr;
            curr=fwd;
        }
        prev.next=prev1;//placing the node to right place
        nodel.next=curr;//placing the node to right place
        return dummy.next;
        
    }
}