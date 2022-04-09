class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)return nums;
    
    // count frequencies by map
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
  
         PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        //traversing the map 
        for(int key:map.keySet()){
            q.add(key);
            if(q.size()>k)
                q.poll();
            
        }
       int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = q.poll();
        }
        return top;
    }
}