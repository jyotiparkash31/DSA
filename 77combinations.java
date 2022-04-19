class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        
        backtrack(res,new ArrayList<>(),n,k,1);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> curr,int n,int k,int num){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));//notes
            return ;
        }
        for(int i=num;i<=n;i++){
            curr.add(i);
            backtrack(res,curr,n,k,i+1);
            curr.remove(curr.size()-1);//remove the last element added
        }
    }
}