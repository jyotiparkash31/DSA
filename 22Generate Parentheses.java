class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(res,"", n,n);
        return res;
    }
    public void helper(List<String> res,String sb,int cop,int ccl){
        if(cop==0 && ccl==0 ){
         res.add(sb.toString()); 
            return;
        }
        if(cop>0){
            // sb.append("(");
            helper(res,sb+'(',cop-1,ccl);
             // sb.setLength(sb.length() - 1);
        }
        if(cop<ccl){
            // sb.append(")");
            helper(res,sb+')',cop,ccl-1);
             // sb.setLength(sb.length() - 1);
        }
       
        
    }
}