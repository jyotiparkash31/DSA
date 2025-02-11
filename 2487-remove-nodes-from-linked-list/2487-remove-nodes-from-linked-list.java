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

 //start checking from the end of the linked list
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }

        curr=st.pop();
        int max=curr.val;

        ListNode result=new ListNode(curr.val);

        while(!st.isEmpty()){
            curr=st.pop();

            if(curr.val<max){
                continue;
            }else{
                ListNode node=new ListNode(curr.val);
                node.next=result;
                result=node;
                max=curr.val;
            }
        }
        return result;
    }
}
