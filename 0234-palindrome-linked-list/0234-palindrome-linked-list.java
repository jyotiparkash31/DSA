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
    ListNode curr=null;
    public boolean isPalindrome(ListNode node) {
        if(node==null)return true;
        if(curr==null){
           curr=node;
        }
        if(node==null){
            return true;
        }
        boolean ans=isPalindrome(node.next);
        if(node.val!=curr.val){
            return false;
        }
        curr=curr.next;
        return ans;
    }

}