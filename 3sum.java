class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> main=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if( i>0 && nums[i]==nums[i-1])continue;//note use this when set do not contains duplicate ans the array is sorted 
            twosum(main,nums,i+1,nums.length-1,0-nums[i]);
        }
        
           return main;
    }
    public static void twosum(List<List<Integer>> main,int[] nums,int low, int high,int target){
       HashSet<Integer> set = new HashSet<>();
        while(low<=high){
            if(set.contains(target-nums[low])){
                main.add(Arrays.asList(-target,nums[low],target-nums[low]));
              while(low+1<=high && nums[low]==nums[low+1]){
                  low++;
              }
            }
            else{
                set.add(nums[low]);
            }
            low++;
        }
    }
}