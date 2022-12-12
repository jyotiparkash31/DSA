class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        if(n==1) return 1;
        if(n==2) return 2;
        dp[0]=1;
        dp[1]=1;//there is only 1 ways to come to stair 1
        dp[2]=2;//there is only 2 ways to come to stair 2
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
        // if(n==0)return 0;
        // if(n==1) return 1;
        // if(n==2) return 2;
        //     return climbStairs(n-1)+climbStairs(n-2);
    }
}