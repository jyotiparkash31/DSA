class Solution {
    public int findPairs(int[] nums, int k) {
         Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int count=0;
        for(int e:map.keySet()){
            if(k>0 && map.containsKey(e+k)||  k == 0 && map.get(e) > 1){
                count++;
            }
        }
        return count;
    }
}