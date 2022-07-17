class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
       result[0]=search(nums,target,true);
            result[1]=search(nums,target,false);
        return result;
        
    }
    int search(int[] arr,int target,boolean first)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            { 
                ans=mid;
                if(first)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return ans;
    }
}