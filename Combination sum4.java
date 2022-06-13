class Solution {
    //we have to count no. ways to get the sum 4 usingf the given num;
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){//each sum will count for each num which will poss the sum
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>=0)
                dp[i]=dp[i]+dp[i-nums[j]];
            }
        }
        return dp[target];
        //in coin change2 the amount is in inner loop beacuse the coin will not be conisederd again
    }
}