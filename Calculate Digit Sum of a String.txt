class Solution {
    public String digitSum(String s, int k) {
    
        while(s.length()>k){
            int sum=0;
            int count=0;
           String ans="";
           for(int i=0;i<s.length();i++){
               sum+=(s.charAt(i)-'0');
               ++count;
               if(count==k){
                   ans=ans+String.valueOf(sum);
                   count=0;
                   sum=0;
               }
               
            }
            if(count>0){
                ans=ans+String.valueOf(sum);
            }
          s=ans;
        }
        return s;
    }
    
}