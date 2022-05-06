class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
       StringBuilder sb = new StringBuilder();
        for(char c : st) sb.append(c);//for(char s : stack) sb.append(s); avoids reversing.... this would print Leetcode... but your suggested - while(!stack.isEmpty()) sb.append(stack.pop()); would print edocteeL.
        return sb.toString();
    }
}