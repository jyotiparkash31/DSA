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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //         ListNode ptr=head;
//         ListNode sz=head;
//         ListNode temp=head;
       
//         int size=0;
//         while(sz!=null){
//             size++;
//             sz=sz.next;
//         }
//         if(size==n)return head.next;
        
//         int nsize=size-(n+1);
        
//         for(int i=0;i<nsize;i++){
//             ptr=ptr.next;
//         }
//         temp=ptr.next;
//         ptr.next=temp.next;
//         temp.next=null;
//         return head;
        ListNode start=new ListNode();
        start.next=head;
        //Move fast in front so that the gap between slow and fast becomes n
        ListNode slow=start,fast=start;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}