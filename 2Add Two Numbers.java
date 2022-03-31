class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dH = new ListNode(-1);
        ListNode newHead = dH;
        int carry = 0;
        
        while(l1!=null || l2!=null) {
            int a = l1 == null ? 0 : l1.val;//if l1 is not null then take value from l1 
            int b = l2 == null ? 0 : l2.val;//if l2 is not null then take value from l2
            
            if(l1!=null) l1 = l1.next;//checking if l1 is not null
            if(l2!=null) l2 = l2.next;//checking if l2 is not null
            
            int sum = a + b + carry;//concept of sum teo element in coding
            int ans=sum%10;
            carry = sum/10;
            
            ListNode newNode = new ListNode(ans);
            dH.next = newNode;
            dH = newNode;
        }
        
        if(carry>0) {
            dH.next = new ListNode(carry);
        }
        return newHead.next;
    }
    
}