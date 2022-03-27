class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=new ListNode(-1);
         ListNode dum=dummy;
        dum.next=head;//potential unique element
        ListNode curr2=head.next;
        while(curr2!=null){
            boolean isloopRun=false;
            while(curr2!=null && dum.next.val==curr2.val){
                isloopRun=true;
                curr2=curr2.next;
            }
            if(isloopRun)
                dum.next=curr2;
            else
                dum=dum.next;
            if(curr2!=null)curr2=curr2.next;
            
        }
        return dummy.next;
       
    }
}