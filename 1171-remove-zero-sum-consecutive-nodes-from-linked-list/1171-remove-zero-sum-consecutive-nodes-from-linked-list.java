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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        Map<Integer, ListNode> map=new HashMap<>();
        int sum=0;
        map.put(0,dummy);
        while(head!=null){
            sum+=head.val;
            if(map.containsKey(sum)){
                ListNode prev=map.get(sum);
                ListNode start=prev.next;
                int p=sum+start.val;
                while(p!=sum){
                    map.remove(p);
                    start=start.next;
                    p+=start.val;
                }
                prev.next=start.next;
            }else{
                map.put(sum,head);
            }
            head=head.next;
        }
return dummy.next;

    }
}