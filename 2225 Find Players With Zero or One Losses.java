class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
       TreeSet<Integer> ans = new TreeSet<>();
		for (int i = 0; i < matches.length; i++) {
			if (!map.containsKey(matches[i][0])) {
				ans.add(matches[i][0]);
			}
		}
		List<Integer> list2 = new ArrayList<>(ans);
        
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getValue()==1){
            ans1.add(e.getKey());
           } 
       }
        
        res.add(list2);
        res.add(ans1);
        return res;
        
    }
}