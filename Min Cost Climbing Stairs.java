class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);//to select the min of pichla steps
        }
        return Math.min(dp[n-1],dp[n-2]);//ye asa is liye likha hai kyu ki dp[n-2] ke baad hm direct top pe hoge ar same dp[n-1]ke next step ke baad hm top me honge to hum do ka min utha rahe hai
    }
}