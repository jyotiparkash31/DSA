class Solution {
    public int minDistance(String w1, String w2) {
        int n=w1.length();int m=w2.length();
        int[][] dp=new int[n+1][m+1];
        // return solve(n-1,m-1,w1,w2,dp);
        
        //tabulation
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
         if(w1.charAt(i-1)==w2.charAt(j-1)){
           dp[i][j] =dp[i-1][j-1];
        }
        else{
           int ans=Math.min(dp[i-1][j],dp[i-1][j-1]);//delete,replace
          dp[i][j]= 1 + Math.min(ans,dp[i][j-1]);  //insert
         }
            }
        }
        return dp[n][m];
        
    }
    
    //memoization
//     private static int solve(int i,int j,String w1,String w2,Integer[][] dp){
//         if(i<0)return j+1;
//         if(j<0)return i+1;
        
//         if(dp[i][j]!=null)return dp[i][j];
        
//         if(w1.charAt(i)==w2.charAt(j)){
//            return  dp[i][j] =solve(i-1,j-1,w1,w2,dp);
//         }
        
//          int ans=Math.min(solve(i-1,j,w1,w2,dp),solve(i-1,j-1,w1,w2,dp));
//          return dp[i][j]= 1 + Math.min(ans,solve(i,j-1,w1,w2,dp));
        
//     }
}