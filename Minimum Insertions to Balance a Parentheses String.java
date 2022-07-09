//Maintain a stack. Every time we see a ( we need to have 2 ) to balance. So we would push 2 to the stack. Then when we see ) we would check the top of the stack. If the top is 2, that means this is the first ) that will match the previous (. So we would change the top to 1. In case the top of stack had 1 it means we are seeing the second ) for some ( and so we just pop this 1 from the stack.

class Solution {
    public int minInsertions(String s) {
      Stack<Integer> st= new Stack<>();
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(st.empty() || st.peek()==2){
                    st.push(2);
                }
                else if(st.peek()==1){
                    st.pop();
                    st.push(2);
                    ans++;
                 }
            }
            else{
                if(st.empty()){
                    st.push(1);
                    ans++;
                }
                else if(st.peek()==1){
                    st.pop();
                }
                else if(st.peek()==2){
                    st.pop();
                    st.push(1);
                }
            }  
        }
         while(!st.empty()){
                ans=ans+st.pop();
            
            }
        return ans;
    }
}