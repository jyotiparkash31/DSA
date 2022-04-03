//The concept is similar to the GFG problem "Allocate minimum # of pages".'
//similaar to 1011. Capacity To Ship Packages Within D Days
class Solution {
    public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end=end+nums[i];
        }
        while(start<end){
            int mid=(start+end)/2;
            int count=1;
            int sum=0;
            for(int i:nums){
                if(sum+i>mid){
                   sum=0;
                   count++;
                }
                sum+=i;     
            }
            if(count>m)//count jada hai to value badhana hoga isliye start=mid+1
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
}