class Solution {
    public int minimumOperations(String num) {
        int n=num.length();
        int j=n-1,ans=n;
        while(j>=0){
            int i=j-1;
            while(i>=0){
            int d=(num.charAt(i)-'0')*10+num.charAt(j)-'0';
            if(d%25==0){
                ans=Math.min(ans,n-i-2);
                break;
            }
                i--;  
        }
            if (num.charAt(j) == '0') ans = Math.min(ans, n - 1);
             j--;
        }
        return ans;
    }
}