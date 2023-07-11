class Solution {
    public boolean canJump(int[] nums) {
//start from end
        int j=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=j){
                j=i;
            }
        }
        return j==0;
        
        
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(max<i)return false;
        //      max=Math.max(nums[i]+i,max);
        // }
        // return true;
    }
}