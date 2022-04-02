//concept of addfirst to reverse the LinkedList
class Solution {
     ListNode th=null;//temp head
     ListNode tt=null;
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null|| head.next==null ||k==0)return head;
        ListNode oh=null;//real head
        ListNode ot=null;
        ListNode curr=head;
        int len=length(head);
        while(len>=k){
            int ktemp=k;
            while(ktemp-->0){
                ListNode fwd=curr.next;
                curr.next=null;
                addfirst(curr);
                curr=fwd;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }
            else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len=len-k;
        }
        ot.next=curr;
        return oh;
    }

    public void addfirst(ListNode node){
        if(th==null){
            th=node;
            tt=node;     
        }
        else{
            node.next=th;
            th=node;
        }
    }
    public int length(ListNode head){
        ListNode curr=head;
        int len=0;
        while(curr!=null){
           len++;
           curr=curr.next;
        }
        return len;
    }
}