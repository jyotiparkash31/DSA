class Solution {
    
    public int maxProfit(int[] prices) {
        int n=prices.length;
        //VALLEY PEAK CONCEPT
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            } 
        }
        return profit;

        
//         int[][]dp=new int[n+1][2];
        
//         for (int[] row : dp)
//             Arrays.fill(row, -1);//memoziation ka code ke liye hai
        
//         return solve(0,1,prices,n,dp);
    }
//     public int solve(int index, int buy,int[] prices,int n,int[][] dp){
//         if(index==n)return 0;
        
//         if(dp[index][buy]!=-1)return dp[index][buy];
        
//         int profit=0;
//         if(buy==1){
//             //agar buy karna hai to paisa lagega is liye price -ve liya use baad sell karna hai 
//             profit=Math.max(-prices[index]+solve(index+1,0,prices,n,dp),
//                             solve(index+1,1,prices,n,dp));
//         }
//         else{
//             //sell kare ge to profit mile ga ar phir buy krege 
//              profit=Math.max(prices[index]+solve(index+1,1,prices,n,dp),
//                             solve(index+1,0,prices,n,dp));
//         }
//         return dp[index][buy]=profit;

//     }
}