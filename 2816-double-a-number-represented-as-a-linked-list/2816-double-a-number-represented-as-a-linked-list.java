/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//  1->reverse
//  2->multiply by 2 and add.
//  3->reverse
class Solution {
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode curr=head;
        int carry=0;
        ListNode prev=curr;
        while(curr!=null){
            int val=curr.val*2+ carry;
            curr.val=val%10;
            carry=val/10;

            prev=curr;
            curr=curr.next;
        }
        if(carry!=0){
            ListNode newHead=new ListNode(carry);
            prev.next=newHead;
        }

        return reverse(head);

    }

    public ListNode reverse(ListNode head){
        if(head==null|| head.next==null){
            return head;
        }
        ListNode node=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return node;
    }
}