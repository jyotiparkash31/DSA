class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> nm=new Stack<>();
        for(char c:s.toCharArray()){
            if(nm.isEmpty()&&c=='#')
                continue;
            else if(c=='#')
                nm.pop();
            else
                nm.push(c);
        }
        StringBuilder a=new StringBuilder();
        while(!nm.isEmpty()){
            char c=nm.pop();
            a.append(c);
        }
        for(char c:t.toCharArray())
        {
            if(nm.isEmpty()&&c=='#')
                continue;
            else if(c=='#')
                nm.pop();
            else
                nm.push(c);
        }
        StringBuilder b=new StringBuilder();
        while(!nm.isEmpty())
        {
            char c=nm.pop();
            b.append(c);
        }
        return a.toString().equals(b.toString());
    
    }
}