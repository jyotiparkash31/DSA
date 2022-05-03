class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left=nums.length-1,right=-1;
       // for(int i=0;i<nums.length;i++){
       //     for(int j=i+1;j<nums.length;j++){
       //         if(nums[j]<nums[i]){
       //            right=Math.max(right,j);//l->r jate hue jaha element chota mila prev ele se
       //            left =Math.min(left,i);//r->l jate hue jaha element bada mila prev element se
       //         }
       //     }
       // }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max){
                right=i;
            }else{
                max=nums[i];
            }
        }
         int min=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>min){
                left=i;
            }else{
                min=nums[i];
            }
        }
         int ans=right-left+1;
        if(ans<0)return 0;
        
        return ans;
    }
}