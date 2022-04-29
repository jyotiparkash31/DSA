class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        boolean [] flag= new boolean[nums.length];
        backtrack(res,new ArrayList<>(),nums,flag);
        return res;
    }
     public void backtrack(List<List<Integer>> res,List<Integer> curr,int[] nums,boolean[] flag){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i])continue;
            if(i>0 && nums[i-1]==nums[i] && !(flag[i-1])) continue;    
            flag[i]=true;
            curr.add(nums[i]);
                backtrack(res,curr,nums,flag);
            flag[i]=false;
                curr.remove(curr.size()-1);
        }
    }
}