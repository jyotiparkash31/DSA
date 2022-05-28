class Solution {
    public int missingNumber(int[] nums) {

//        int i=0;
//         while(i<nums.length)
//         {
//             int correctindex=nums[i];//this is the correct index where the nums[i] should be found
//             if(nums[i]<nums.length && nums[i]!=nums[correctindex]) {
//                int temp=nums[correctindex];
//                 nums[correctindex]=nums[i];
//                 nums[i]=temp;
//             }
//         else
//         {
//             i++;
//         }
//     }
//     //search for the first missing no.
//         for(int index=0;index<nums.length;index++)
//         {
//             if(nums[index]!=index)
//             {
//                 return index;
//             }
            
//         }
        
//          return nums.length;
       //SUM METHOD 

    //     int sum = nums.length;
    // for (int i = 0; i < nums.length; i++)
    //     sum += i - nums[i];
    // return sum;
        //BIT MANIPULATION
        int miss=0;int i=0;
        for( i=0;i<nums.length;i++){
            miss=miss^i^nums[i];
        }
        return miss^i;
        
        //         Arrays.sort(nums);
//        int start=0;
//         int end=nums.length;
//         while(start<end)
//         {
//             int mid=(start+end)/2;
//             if(nums[mid]-mid<1)
//             {
                
//                 start=mid+1;
                
//             }
//             else
//             {
//                 end=mid;
//             }  
//         }
//         return start;
    }
}