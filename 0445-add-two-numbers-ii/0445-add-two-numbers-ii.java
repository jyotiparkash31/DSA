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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         Stack<Integer> st1=new Stack<>(); 
        Stack<Integer> st2=new Stack<>(); 
        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
         while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
         int carry= 0;
        ListNode result=null;
        ListNode newNode;
        while(!st1.isEmpty() || !st2.isEmpty() ||carry!=0){
            
            int sum = (!st1.isEmpty()?st1.pop():0)+(!st2.isEmpty()?st2.pop():0)+carry;
            carry = sum/10;
            newNode  = new ListNode(sum%10);
            newNode.next = result;
            result = newNode;
        }
        return result;
    }
}