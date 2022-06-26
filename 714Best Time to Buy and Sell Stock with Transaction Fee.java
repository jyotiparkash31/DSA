class Solution {
    public int maxProfit(int[] prices, int fee) {
        

         int n=prices.length;
        int[][]dp=new int[n+1][2];
        
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solve(0,1,prices,n,dp,fee);
    }
     public int solve(int index, int buy,int[] prices,int n,int[][] dp,int fee){
       if(index==n)return 0;
        
        if(dp[index][buy]!=-1) return dp[index][buy];
        
        int profit=0;
        if(buy==1){
            profit=Math.max(-(prices[index]+fee)+solve(index+1,0,prices,n,dp,fee),
                            solve(index+1,1,prices,n,dp,fee));
        }
        else{
             profit=Math.max(prices[index]+solve(index+1,1,prices,n,dp,fee),
                            solve(index+1,0,prices,n,dp,fee));
        }
        return dp[index][buy]=profit;
    }
}