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

 //remember take fast to k and point slow to head and then again traverse slow and fast till fast is not null
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode start=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        start=fast;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp=start.val;
        start.val=slow.val;
        slow.val=temp;
        return head;

    }
}