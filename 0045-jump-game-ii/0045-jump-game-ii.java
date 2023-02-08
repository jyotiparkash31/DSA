class Solution {
    Integer[] dp;

    public int jump(int[] nums) {
        dp=new Integer[nums.length];
		return bruteForceRec(nums, 0);
	}

	private int bruteForceRec(int[] nums, int start) {
		if (start >= nums.length - 1) {
			return 0;
		}
        if(dp[start]!=null)return dp[start];
        
		int min = 10000 ;//max value can be 1000
		for (int i = start + 1; i <= nums[start] + start; i++) {
			min = Math.min(min, 1 + bruteForceRec(nums, i));
		}
		return dp[start]=min;
	}
}