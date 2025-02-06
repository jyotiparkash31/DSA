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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        ListNode[] parts =new ListNode[k];
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int bucketSize=l/k;//minimum guaranteed part size
        int extraNode=l%k;//extra nodes spread to the first r parts;
        ListNode curr=head,prev=null;
        for(int i=0 ; curr!=null && i<k;i++){
            parts[i]=curr;
            for(int j=0;j<bucketSize+(extraNode > 0 ? 1 : 0) ;j++){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            extraNode--;
        }
        return parts;
    }
}