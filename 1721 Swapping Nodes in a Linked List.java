class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null|| head.next==null)return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode pehla=head,dusra=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        pehla=fast;
        while(fast.next!=null){//isme ye hai ki jb tk fast pehla node jisko swap karna waha tk aye ga tb tk fast ar slow me k ka difference hoga 
            fast=fast.next;
            slow=slow.next;
        }
        dusra=slow;
        int temp=pehla.val;
        pehla.val=dusra.val;
        dusra.val=temp;
        return head;
        
    }
}