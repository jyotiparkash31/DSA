/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //by using length difference
//         int lenA=length(headA);
//         int lenB=length(headB);
//         while(lenA>lenB){
//             headA=headA.next;
//             lenA--;
//         }
//          while(lenB>lenA){
//             headB=headB.next;
//             lenB--;
//         }
        
//         while(headA!=headB){
//             headA=headA.next;
//             headB=headB.next;
//         }
        
//         return headA;
        
        //x+y=y+x concept
        if(headA==null || headB)
            return null;
        
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=(a==null)?headB: a.next;
            b=(b==null)?headA: b.next;
        }
        return a;
    }
    private int length(ListNode A){
        int len=0;
        while(A!=null){
            A=A.next;
            len++;
        }
        return len;
    }
}