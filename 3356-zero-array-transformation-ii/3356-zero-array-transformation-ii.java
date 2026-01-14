class Solution {
    //minum number of queries to make the nus to zero and for that first we use distinct array concept and after we got that we used binary searchto fins the min queries required
    public int minZeroArray(int[] nums, int[][] queries) {
        int left = 0, right = queries.length, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isZeroArray(nums, queries, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    private boolean isZeroArray(int[] nums, int[][] queries, int mid) {
        int n=nums.length;
        int[] diff=new int[n+1];
        for(int i=0;i<mid;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int val=queries[i][2];
            diff[start]+=val;
            if(end+1<n){
                diff[end+1]-=val;
            }
        }
        int curDecrement=0;
        for(int i=0;i<n;i++){
            curDecrement+=diff[i];
            if(nums[i]>curDecrement){
                return false;
            }
        }
        return true;
    }
}