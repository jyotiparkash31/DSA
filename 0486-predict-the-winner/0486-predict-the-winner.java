class Solution {
   
    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for (int[] row: dp)
        Arrays.fill(row, -1);
        
        int sum=0;
        int p1score = rec(nums,0,n-1,dp);
        for(int num:nums){
            sum=sum+num;
        }
        if(p1score>=sum-p1score) return true;
        return false;
     
    }
    public int rec(int[] nums,int i,int j,int[][] dp){
        if(i>j)return 0 ;
        if(dp[i][j]!=-1)return dp[i][j];
        int choice1=nums[i]+Math.min(rec(nums,i+2,j,dp),rec(nums,i+1,j-1,dp));
        int choice2=nums[j]+Math.min(rec(nums,i,j-2,dp),rec(nums,i+1,j-1,dp));
        return dp[i][j]=Math.max(choice1,choice2);
    }
    
}