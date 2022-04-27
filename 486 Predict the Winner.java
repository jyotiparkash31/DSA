class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
        int sum=0;
        int p1score = rec(nums,0,n-1);
        for(int num:nums){
            sum=sum+num;
        }
        if(p1score>=sum-p1score) return true;
        return false;
    
        
    }
    public int rec(int[] nums,int i,int j){
        if(i>j)return 0 ;
        int choice1=nums[i]+Math.min(rec(nums,i+2,j),rec(nums,i+1,j-1));
        int choice2=nums[j]+Math.min(rec(nums,i,j-2),rec(nums,i+1,j-1));
        int score=Math.max(choice1,choice2);
        return score;
    }
}