/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//this is floyd algorithm for cycle detection also called as tortoise and hare method
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode curr=cycle(head);//slow pointer position
        if(curr==null || curr.next==null)return null;//this is to check if cycle is found or not
        ListNode run=head;
        while(curr!=run){
            run=run.next;
            curr=curr.next;
        }
        return run;    
    }
    public ListNode cycle(ListNode head){
          if (head == null || head.next == null)
             return null;
         ListNode fast=head;
         ListNode slow=head;
         while(fast!=null && fast.next!=null ){
             fast=fast.next.next;
             slow=slow.next;
             if(fast==slow){
                return slow; 
             } 
         }
         return null;
    }
}