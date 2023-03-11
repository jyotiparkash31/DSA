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
    ArrayList<Integer> list = new ArrayList<>();
    ListNode temp;
    Random random;

    public Solution(ListNode head) {
        // while(head!=null){
        //     list.add(head.val);
        //     head=head.next;
        // }

        temp = head;
        random = new Random();
    }

    public int getRandom() {
        // int pick= (int)(Math.random()*list.size());
        // System.out.println(pick);
        // return list.get(pick);

        ListNode c = temp;
        int r = -1;
        for (int i = 1; c != null; i++) {
            if (random.nextInt(i) == i-1) r = c.val;
              c = c.next;
        }

        return r;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
