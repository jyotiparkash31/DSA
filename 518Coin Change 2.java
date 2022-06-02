class Solution {
    public int change(int amount, int[] coins) {
        
        int n=coins.length;
        //the difference beetween the coin change is the amount array in this in inner loop
       // if(coins == null)
       //      return 0;
        
//         int[] dp = new int[amount+1];
//         dp[0]=1;
        
//         for(int i=0; i<coins.length; i++){
//             for(int amt=1; amt<=amount; amt++){
//                 if(amt-coins[i]>=0)
//                     dp[amt] = (dp[amt]+dp[amt-coins[i]]); 
//           } 
//         }
//         for(int a: dp)
//             System.out.print(a+" ");
//         return dp[amount];
        
        int[][] dp=new int[n+1][amount+1];
        
        
        for(int i=1;i<=n;i++){
            for(int sum=0;sum<=amount;sum++){
                if(sum==0)
                    dp[i][sum]=1;
                else
                {
                     int opt1= (i==1) ? 0:dp[i-1][sum];
                     int opt2=(coins[i-1]>sum)? 0: dp[i][sum-coins[i-1]];
                     dp[i][sum]=opt1+opt2;
                }
               
            }
        }
        return dp[n][amount];
    }
}