class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int n=nums.size();
        
        int ans=0;
        if(nums.get(0)>0)ans++;
        for(int i=0;i<n-1;i++){
            if((nums.get(i)<=i) && (nums.get(i+1)>i+1)){
                ans++;
            }
        }
        if(n-1>= nums.get(n-1))ans++;
        
        return ans;
    }
}
