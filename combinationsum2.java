class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<>(),candidates,target,0,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> curr,int [] nums,int target,int cindex,int sum){
    
        if(sum==target){
            res.add(new ArrayList<>(curr));//notes
            return ;//store the solution and backtrack
        }
    
        if(sum>target) return;//backtrack
    
        for(int i=cindex;i<nums.length;i++){
            if(i>cindex && nums[i]==nums[i-1])continue;// use this when set do not contain duplicate and array should be sorted
            curr.add(nums[i]);
            sum+=nums[i];
            backtrack(res,curr,nums,target,i+1,sum);
            curr.remove(curr.size()-1);//remove the last element added
            sum-=nums[i];
            
        }
    }
}