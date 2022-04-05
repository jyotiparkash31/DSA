class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0,storage=0;
        while(i<j){
            storage=Math.min(height[i],height[j])*(j-i);
            if(height[i]<height[j])
                i++;
            else
                j--;
            ans=Math.max(ans,storage);
            
        }
        return ans;
        
    }
}