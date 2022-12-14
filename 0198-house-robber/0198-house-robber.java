class Solution {
    //dp tabulation solution using 1D dp array
    public int rob(int[] nums) {
        int n=nums.length-1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // if(nums.length==1)return nums[0];
        // int[] dp=new int[nums.length];
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<nums.length;i++){
        //     dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        // }
        // return dp[nums.length-1];
        return solve(n,nums,dp);
    }
private static int solve(int index,int[]nums,int[]dp){
    if(index==0)return nums[0];
    if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];
        
    int max=Integer.MIN_VALUE;
    int ans1=nums[index]+solve(index-2,nums,dp);
    int ans2=solve(index-1,nums,dp);
    return dp[index]=Math.max(ans1,ans2);
     
}
}