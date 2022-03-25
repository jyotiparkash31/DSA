class Solution {
    public int[] nextLargerNodes(ListNode head) {
       ArrayList<Integer> al=new ArrayList<>();
        for(ListNode node=head;node!=null;node=node.next){
            al.add(node.val);
        }
        int[] arr=new int[al.size()];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<al.size();i++){
            while(!st.empty() && al.get(st.peek())<al.get(i)){
                arr[st.pop()]=al.get(i);
            }
            st.push(i);
        }
        return arr;
    }
}