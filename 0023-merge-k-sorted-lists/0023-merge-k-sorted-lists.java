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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new NodeComprator());
        for(ListNode list: lists){
            ListNode node=list;
            while(node!=null){
               pq.add(new ListNode(node.val));
                node = node.next;
            }
        }
        ListNode ans = pq.isEmpty() ? null : pq.poll();
        ListNode curr = ans;
        
        while(!pq.isEmpty()){
            curr.next = pq.poll();
            curr = curr.next;
        }
        
        return ans;
    }
}
class NodeComprator implements Comparator<ListNode>{
    //@override
    public int compare(ListNode l1,ListNode l2){
        return l1.val-l2.val;
    }
    
}