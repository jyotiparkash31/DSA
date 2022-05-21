//tricky question
class Solution {
    int[][] dp=new int[10000+1][12+1];
    public int coinChange(int[] coins, int amount) {
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int minC=tabulation(coins, amount, coins.length);
        return minC == Integer.MAX_VALUE- 1 ? -1 : minC; 
    }
    public int tabulation(int []arr,int w,int n){
         for (int i = 0; i < w + 1; i++)
            for (int j = 0; j < n + 1; j++)
                if (i == 0 || j == 0)
                    dp[i][j] = (i == 0) ? 0 :Integer.MAX_VALUE - 1;
        
        for (int i = 1; i < w + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (arr[j - 1] > i) 
                    dp[i][j] = 0 + dp[i - 0][j - 1];
                else 
                    dp[i][j] = Math.min(0 + dp[i - 0][j - 1], 1 + dp[i - arr[j - 1]][j - 0]);
            }
        }
        
        return dp[w][n];
    }
}