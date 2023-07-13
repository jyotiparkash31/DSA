class Solution {
    public int subarraySum(int[] nums, int k) {
         int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(sum,map.getOrDefault(sum,0)+1);//this line is written first becausewhen sum-k==0 then count should be increased so by doing this we cab put 0->1 in map
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
        }
        return count;     
    }
}