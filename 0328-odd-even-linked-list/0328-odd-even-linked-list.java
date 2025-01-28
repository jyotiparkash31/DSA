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

 //create odd link and even link and join both at the end
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even=head.next;
        ListNode odd=head;
        ListNode even_start=head.next;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=even_start;
        return head;
    }
}